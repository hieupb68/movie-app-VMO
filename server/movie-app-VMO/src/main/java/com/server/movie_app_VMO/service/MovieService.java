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

    public List<Movie> searchMovies(String title) {
        return movieRepository.findByTitleContaining(title);
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
