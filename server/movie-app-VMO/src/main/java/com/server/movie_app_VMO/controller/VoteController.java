package com.server.movie_app_VMO.controller;

import com.server.movie_app_VMO.entity.Vote;
import com.server.movie_app_VMO.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @GetMapping("/movie/{movieId}")
    public List<Vote> getVotesByMovieId(@PathVariable Long movieId) {
        return voteService.getVotesByMovieId(movieId);
    }

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.saveVote(vote);
    }

    @DeleteMapping("/{id}")
    public void deleteVote(@PathVariable Long id) {
        voteService.deleteVote(id);
    }
}