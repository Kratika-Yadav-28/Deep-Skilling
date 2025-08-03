import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [amount, setAmount] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const conversionRate = 0.0099; 
    const convertedEuro = (parseFloat(amount) * conversionRate).toFixed(2);

    alert(`Converting to Euro Amount is ${convertedEuro}`);
  };

  return (
    <div style={{ marginTop: '50px' }}>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </div>

        <div style={{ marginBottom: '10px' }}>
          <label>Currency: </label>
          <input type="text" value="Euro" disabled />
        </div>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default CurrencyConvertor;
