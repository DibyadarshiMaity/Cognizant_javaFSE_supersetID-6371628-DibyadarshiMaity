import React from "react";

function UserPage({ onLogout }) {
  return (
    <div>
      <h2>Welcome,Back</h2>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}

export default UserPage;
