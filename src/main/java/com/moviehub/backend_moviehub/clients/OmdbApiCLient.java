package com.moviehub.backend_moviehub.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviehub.backend_moviehub.models.MovieDetails;
import com.moviehub.backend_moviehub.models.Search;

@FeignClient(name = "omdb-api",url = "https://www.omdbapi.com/")
public interface OmdbApiCLient {

    @GetMapping
    Search searchMovies(@RequestParam("s") String title,@RequestParam("apiKey") String apiKey);

    @GetMapping
    MovieDetails movieDetails(@RequestParam("i") String imdbID,@RequestParam("apiKey") String apiKey);
}
