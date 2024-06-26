package com.server.movie_app_VMO.controller;

import com.server.movie_app_VMO.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;
    // endpoints
}