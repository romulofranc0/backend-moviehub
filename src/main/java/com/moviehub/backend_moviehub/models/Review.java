package com.moviehub.backend_moviehub.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Review {

    private String id;
    private String userId;
    private String movieId;
    private String content;
    private int rating;
    private LocalDateTime createdAt;
}
