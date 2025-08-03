import React, { useState } from "react";

function CurrencyConverter() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = () => {
    const converted = (parseFloat(rupees) / 90).toFixed(2);
    setEuro(converted);
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <input
        type="number"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
        placeholder="Enter INR"
      />
      <button onClick={handleSubmit}>Convert to Euro</button>
      {euro && <p>{rupees} INR = {euro} EUR</p>}
    </div>
  );
}

export default CurrencyConverter;
