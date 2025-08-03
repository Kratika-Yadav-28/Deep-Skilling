import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  const sayHello = () => {
    console.log("Hello! Member1");
    alert("Hello! Member1");
  };

  const increment = () => {
    setCount(prev => prev + 1);  
    sayHello();                  
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  return (
    <div style={{display: 'flex', flexDirection: 'column', alignItems: 'flex-start'}} >
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </div>
  );
}

export default Counter;
