package com.moviehub.backend_moviehub.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OmdbControllerTest {

    @Autowired
    private OmdbController controller;

    @Test
    void testGetDetails() {
        
    }

    @Test
    void testGetMovies() {
        controller.getMovies("drive");
    }
}
