package com.server.movie_app_VMO.service;


import com.server.movie_app_VMO.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    // methods
}
