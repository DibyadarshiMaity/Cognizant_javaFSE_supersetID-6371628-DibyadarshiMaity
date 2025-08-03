import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "M.S Dhoni", score: 85 },
    { name: "Rohit Sharma", score: 90 },
    { name: "Virat Kholi", score: 75 },
    { name: "Hardik Pandya", score: 65 },
    { name: "Ravindra Jadeja", score: 45 },
    { name: "Muhammad Shami", score: 55 },
    { name: "Jasprit Bumrah", score: 70 },
    { name: "Kuldeep Yadav", score: 60 },
    { name: "Sachin Tendulkar", score: 95 },
    { name: "Dinesh Kartik", score: 50 },
    { name: "Arshdeep Singh", score: 80 },
  ];
   const players70 = [];
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
  });

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((item) => (
          <li>
            Mr.{item.name}<span> {item.score}</span>
          </li>
        ))}
      </ul>
      <h3>Players with Score Below 70</h3>
      <ul>
        {players70.map((item)=>(
          <li>
            Mr.{item.name}<span> {item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
