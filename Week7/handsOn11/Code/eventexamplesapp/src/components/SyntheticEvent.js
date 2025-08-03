import React from 'react';

function SyntheticEvent() {
  const handleClick = (e) => alert("I was clicked");

  return (
  <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-start' }}>
    <button onClick={handleClick}>Click Me</button>
  </div>
);
   
}

export default SyntheticEvent;
