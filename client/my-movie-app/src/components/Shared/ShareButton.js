import React from 'react';

const ShareButton = ({ movie }) => {
  const shareMovie = () => {
    const url = `https://www.facebook.com/sharer/sharer.php?u=${window.location.href}`;
    window.open(url, '_blank');
  };

  return (
    <button onClick={shareMovie}>Share on Facebook</button>
  );
};

export default ShareButton;
