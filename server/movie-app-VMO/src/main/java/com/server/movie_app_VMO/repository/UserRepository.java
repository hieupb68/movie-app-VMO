package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}