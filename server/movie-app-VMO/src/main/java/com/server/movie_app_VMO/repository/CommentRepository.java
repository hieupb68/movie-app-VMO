package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {}
