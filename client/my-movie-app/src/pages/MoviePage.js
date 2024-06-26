import React from 'react';
import { useParams } from 'react-router-dom';
import MovieDetail from '../components/Movie/MovieDetail';

const MoviePage = () => {
  const { id } = useParams();
  return (
    <div>
      <MovieDetail id={id} />
    </div>
  );
};

export default MoviePage;
