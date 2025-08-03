import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      id: 1,
      name: "Got Tower",
      rent: 75000,
      address: "Jahangirabad, Bhopal",
      image: "/images/office1.jpg"
    },
    {
      id: 2,
      name: "Friends Room",
      rent: 55000,
      address: "Andheri, Mumbai",
      image: "/images/office2.jpg"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>

      {offices.map((office) => (
        <div key={office.id} style={{ border: "1px solid #ccc", margin: "10px", padding: "10px" }}>
          <img src={office.image} alt={office.name} style={{ width: "300px" }} />
          <h2><strong>Name: </strong>{office.name}</h2>
          <p style={{ color: office.rent < 60000 ? "red" : "green" }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
