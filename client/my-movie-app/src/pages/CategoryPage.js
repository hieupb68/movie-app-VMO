import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import api from '../services/api';
import MovieList from '../components/Movie/MovieList';

const CategoryPage = () => {
  const { id } = useParams();
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    api.get(`/categories/${id}/movies`).then(response => {
      setMovies(response.data);
    });
  }, [id]);

  return (
    <div>
      <h1>Category Page</h1>
      <MovieList movies={movies} />
    </div>
  );
};

export default CategoryPage;
