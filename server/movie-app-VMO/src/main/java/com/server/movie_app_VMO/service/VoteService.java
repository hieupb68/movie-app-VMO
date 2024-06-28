package com.server.movie_app_VMO.service;

import com.server.movie_app_VMO.entity.Vote;
import com.server.movie_app_VMO.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> getVotesByMovieId(Long movieId) {
        return voteRepository.findByMovieId(movieId);
    }

    public Vote saveVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteVote(Long id) {
        voteRepository.deleteById(id);
    }
}