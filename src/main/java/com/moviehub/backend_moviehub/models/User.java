package com.moviehub.backend_moviehub.models;

import java.util.List;

import lombok.Data;

@Data
public class User {

    private String userId;
    private String name;
    private String email;
    private String googleId;
    private List<User> following;

    }
