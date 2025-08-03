import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div>
      {isLoggedIn ? (
        <>
          <UserPage />
          <LogoutButton onLogout={handleLogout} />
          
        </>
      ) : (
        <>
          <GuestPage />
          <LoginButton onLogin={handleLogin} />
          
        </>
      )}
    </div>
  );
}

export default App;
