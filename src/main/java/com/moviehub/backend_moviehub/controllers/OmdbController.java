package com.moviehub.backend_moviehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviehub.backend_moviehub.models.MovieDetails;
import com.moviehub.backend_moviehub.models.Search;
import com.moviehub.backend_moviehub.services.MovieService;


@RestController
public class OmdbController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public Search getMovies(@RequestParam String title) {
        return movieService.getMovies(title);
    }

    @GetMapping("/details")
    public MovieDetails getDetails(@RequestParam String imdbID) {
        return movieService.getDetails(imdbID);
    }
    
    
}
