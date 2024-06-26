import React, { useEffect, useState } from 'react';
import api from '../../services/api';

const ManageMovies = () => {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    api.get('/admin/movies').then(response => {
      setMovies(response.data);
    });
  }, []);

  return (
    <div>
      <h1>Manage Movies</h1>
      <ul>
        {movies.map(movie => (
          <li key={movie.id}>{movie.title}</li>
        ))}
      </ul>
    </div>
  );
};

export default ManageMovies;
