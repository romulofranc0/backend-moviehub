package com.moviehub.backend_moviehub.controllers;

import org.springframework.stereotype.Controller;

import com.moviehub.backend_moviehub.models.MovieDetails;
import com.moviehub.backend_moviehub.models.Search;
import com.moviehub.backend_moviehub.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OmdbController {

    private MovieService movieService;


    @GetMapping("/movies")
    public Search getMovies(@RequestParam String title) {
        return movieService.getMovies(title);
    }

    @GetMapping("/details")
    public MovieDetails getDetails(@RequestParam String imdbId) {
        return movieService.getDetails(imdbId);
    }
    
    
}
