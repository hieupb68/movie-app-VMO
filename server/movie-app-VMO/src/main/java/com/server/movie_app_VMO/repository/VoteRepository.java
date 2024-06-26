package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {}