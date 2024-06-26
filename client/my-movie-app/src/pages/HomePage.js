import React, { useEffect, useState } from 'react';
import axios from 'axios';
import MovieList from '../components/Movie/MovieList';

const HomePage = () => {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    axios.get('/api/movies').then(response => {
      setMovies(response.data);
    });
  }, []);

  return (
    <div>
      <h1>Home Page</h1>
      <MovieList movies={movies} />
    </div>
  );
};

export default HomePage;
