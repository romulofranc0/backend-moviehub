package com.moviehub.backend_moviehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviehub.backend_moviehub.entities.List;

@Repository
public interface ListRepository extends JpaRepository<List, Long>{

}
