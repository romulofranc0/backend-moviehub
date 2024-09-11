package com.moviehub.backend_moviehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviehub.backend_moviehub.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName(String name);

}
