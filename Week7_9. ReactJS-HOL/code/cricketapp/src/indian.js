import React from "react";
export function OddPlayers({ players: [first, , third, , fifth] }) {
  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
}
export function EvenPlayers({ players: [, second, , fourth, , sixth] }) {
  return (
    <div>
      <h2>Even Players</h2>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
}
const T20Players = ["Sachin Tendulkar", "M.S Dhoni", "Virat Kholi"];
const RanjiTrophyPlayers = ["Rohit Sharma", "Yuvaraj singh", " Suresh Raina"];
export const IndianPlayersMerged = [...T20Players, ...RanjiTrophyPlayers];

const IndianPlayers = () => {
  return (
    <div>
         <OddPlayers players={IndianPlayersMerged} />
      <EvenPlayers players={IndianPlayersMerged} />
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {IndianPlayersMerged.map((player) => (
          <li>Mr. {player}</li>
        ))}
      </ul>
     
    </div>
  );
};

export default IndianPlayers;
