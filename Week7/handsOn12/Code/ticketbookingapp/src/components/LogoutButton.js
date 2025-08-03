import React from 'react';

const LogoutButton = ({ onLogout }) => (
  <div style={{ textAlign: 'center', margin: '10px' }}><button onClick={onLogout}>Logout</button>
  </div>
);

export default LogoutButton;
