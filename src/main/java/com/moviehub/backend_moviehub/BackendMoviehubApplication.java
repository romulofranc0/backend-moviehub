package com.moviehub.backend_moviehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackendMoviehubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMoviehubApplication.class, args);
	}

}
