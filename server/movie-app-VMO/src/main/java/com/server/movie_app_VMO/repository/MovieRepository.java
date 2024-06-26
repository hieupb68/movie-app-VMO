package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
