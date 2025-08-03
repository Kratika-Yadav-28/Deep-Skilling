import React from 'react';

const LoginButton = ({ onLogin }) => (
  <div style={{ textAlign: 'center', margin: '10px' }}>
    <button onClick={onLogin}>Login</button>
  </div>
);

export default LoginButton;
