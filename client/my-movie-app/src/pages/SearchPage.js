import React, { useState } from 'react';
import api from '../services/api';
import MovieList from '../components/Movie/MovieList';

const SearchPage = () => {
  const [query, setQuery] = useState('');
  const [movies, setMovies] = useState([]);

  const handleSearch = (e) => {
    e.preventDefault();
    api.get(`/search?query=${query}`).then(response => {
      setMovies(response.data);
    });
  };

  return (
    <div>
      <h1>Search Page</h1>
      <form onSubmit={handleSearch}>
        <input
          type="text"
          value={query}
          onChange={(e) => setQuery(e.target.value)}
          placeholder="Search for movies..."
        />
        <button type="submit">Search</button>
      </form>
      <MovieList movies={movies} />
    </div>
  );
};

export default SearchPage;
