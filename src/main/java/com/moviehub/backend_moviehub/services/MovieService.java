package com.moviehub.backend_moviehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.moviehub.backend_moviehub.clients.OmdbApiCLient;
import com.moviehub.backend_moviehub.models.MovieDetails;
import com.moviehub.backend_moviehub.models.Search;

@Service
public class MovieService {

    @Autowired
    private OmdbApiCLient omdbApiCLient;

    @Autowired
    private Environment environment;

    public MovieDetails getDetails(String imdbID) {
        String apiKey = environment.getProperty("omdb.api.key");
        return omdbApiCLient.movieDetails(imdbID, apiKey);
    }

    public Search getMovies(String title) {
        String apiKey = environment.getProperty("omdb.api.key");
        return omdbApiCLient.searchMovies(title, apiKey);
    }
}
