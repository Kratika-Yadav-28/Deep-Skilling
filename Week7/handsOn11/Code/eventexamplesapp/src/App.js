import React from 'react';
import Counter from './components/Counter';
import WelcomeButton from './components/WelcomeButton';
import SyntheticEvent from './components/SyntheticEvent';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <Counter />
      <WelcomeButton />
      <SyntheticEvent />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
