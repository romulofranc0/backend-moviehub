package com.moviehub.backend_moviehub.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Movie {
    
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Poster")
    private String poster;

}
