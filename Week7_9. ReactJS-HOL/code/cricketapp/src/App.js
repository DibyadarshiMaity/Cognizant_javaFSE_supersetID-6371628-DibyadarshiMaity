import logo from './logo.svg';
import './App.css';
import React, { useState } from "react";
import ListofPlayers from './player';
import IndianPlayers from "./indian";

function App() {
  const [flag, setFlag] = useState(true);
  const toggleFlag = () => {
    setFlag(prevFlag => !prevFlag);
  };

  return (
    <div className="App">
      <h1>Welcome to Cricket App</h1>
      <button onClick={toggleFlag}>
        Show {flag ? "Indian Players" : "List of Players"}
      </button>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}
export default App;

