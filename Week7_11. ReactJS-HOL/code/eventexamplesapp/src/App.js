import React, { useState } from "react";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(count + 1);
    sayHello();
  };

  const handleDecrement = () => setCount(count - 1);

  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleSyntheticClick = (event) => {
    console.log("Synthetic Event Triggered");
    alert("I was clicked");
  };

  return (
    <div>
      <h1>Event Handling in React</h1>
      <h2>Counter: {count}</h2>

      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome to the  App!")}>
        Say Welcome
      </button>

      <br /><br />
      <button onClick={handleSyntheticClick}>Trigger Synthetic Event</button>

      <br /><br />
      <CurrencyConverter />
    </div>
  );
}

export default App;
