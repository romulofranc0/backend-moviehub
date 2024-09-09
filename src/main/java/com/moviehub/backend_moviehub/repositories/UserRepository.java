package com.moviehub.backend_moviehub.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviehub.backend_moviehub.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}