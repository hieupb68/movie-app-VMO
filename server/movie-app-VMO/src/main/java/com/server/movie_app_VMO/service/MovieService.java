package com.server.movie_app_VMO.service;

import com.server.movie_app_VMO.entity.Movie;
import com.server.movie_app_VMO.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() { return movieRepository.findAll(); }
    public Movie getMovieById(Long id) { return movieRepository.findById(id).orElse(null); }
}
