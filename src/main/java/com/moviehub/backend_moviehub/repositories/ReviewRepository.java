package com.moviehub.backend_moviehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviehub.backend_moviehub.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

}
