package com.server.movie_app_VMO.controller;

import com.server.movie_app_VMO.entity.Movie;
import com.server.movie_app_VMO.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public List<Movie> getAllMovies() { return movieService.getAllMovies(); }
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) { return movieService.getMovieById(id); }
    // other endpoints
}
