package com.server.movie_app_VMO.service;

import com.server.movie_app_VMO.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;
    // methods
}