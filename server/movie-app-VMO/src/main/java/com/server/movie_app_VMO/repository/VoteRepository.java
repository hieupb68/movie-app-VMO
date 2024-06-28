package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByMovieId(Long movieId);
}