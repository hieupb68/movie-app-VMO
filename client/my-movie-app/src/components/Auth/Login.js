import React from 'react';
import { useDispatch } from 'react-redux';
import { useHistory } from 'react-router-dom';

const Login = () => {
  const dispatch = useDispatch();
  const history = useHistory();

  const handleLogin = (provider) => {
    // Dispatch login action for the provider (e.g., Google, Facebook)
    dispatch(loginWithProvider(provider))
      .then(() => {
        history.push('/');
      });
  };

  return (
    <div>
      <h1>Login</h1>
      <button onClick={() => handleLogin('google')}>Login with Google</button>
      <button onClick={() => handleLogin('facebook')}>Login with Facebook</button>
    </div>
  );
};

export default Login;
