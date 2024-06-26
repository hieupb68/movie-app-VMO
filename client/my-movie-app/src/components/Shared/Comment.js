import React from 'react';

const Comment = ({ comment }) => {
  return (
    <div>
      <p>{comment.text}</p>
      <small>by {comment.user.username}</small>
    </div>
  );
};

export default Comment;
