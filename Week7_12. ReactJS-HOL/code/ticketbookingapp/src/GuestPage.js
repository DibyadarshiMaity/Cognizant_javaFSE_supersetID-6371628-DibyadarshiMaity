import React from "react";

function GuestPage({ onLogin }) {
  return (
    <div>
      <h1>Please Sign up.</h1>
      <button onClick={onLogin}>Login to Book Tickets</button>
    </div>
  );
}

export default GuestPage;
