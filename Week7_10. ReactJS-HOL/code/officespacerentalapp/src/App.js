import React from "react";
import officeImage1 from './image_1.jpg';
import officeImage2 from './image_3.jpg';
import officeImage3 from './image_4.jpg';
import "./App.css";
const officeList = [
  {
    id: 1,
    name: "Tech Park",
    rent: 25000,
    address: "Indiranagar, Bangalore",
    image: officeImage1
  },
  {
    id: 2,
    name: "DBS",
    rent: 75000,
    address: "Cyber City, Gurugram",
    image: officeImage2
  },
  {
    id: 3,
    name: "RDB Town",
    rent: 58000,
    address: "Hitech City, Hyderabad",
    image: officeImage3
  }
];

function App() {
  return (
    <div className="App">
      <h1>Office Space Rental App</h1>
      {officeList.map((office) => (
        <div
          key={office.id}
          style={{
            border: "1px solid #ccc",
            padding: "16px",
            margin: "16px auto",
            width: "50%",
            borderRadius: "8px"
          }}
        >
          <h2>{office.name}</h2>
          <img
            src={office.image}
            alt={office.name}
            style={{ width: "100%", height: "50%", objectFit: "cover" }}
          />
          <p>
            <strong>Address:</strong> {office.address}
          </p>
          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold"
            }}
          >
            Rent: ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;

