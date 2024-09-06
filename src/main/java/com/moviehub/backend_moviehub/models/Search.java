package com.moviehub.backend_moviehub.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class Search {

    @JsonProperty("Search")
    private List<OmdbResponse> search;

}
