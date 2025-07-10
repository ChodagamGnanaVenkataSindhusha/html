import "bootstrap/dist/css/bootstrap.min.css";
import React, { useState } from "react";
import Room from "./Room";
import "bootstrap/dist/css/bootstrap.min.css";

function SmartHome() {
  const [activeRoom, setActiveRoom] = useState("kitchen");

  const rooms = ["kitchen", "living", "bedroom", "washroom"];

  return (
    <div>
      <h1 className="text-center bg-success text-white p-3">🏠 SMART HOME</h1>
      <div className="d-flex justify-content-around mb-3">
        {rooms.map((room) => (
          <button key={room} onClick={() => setActiveRoom(room)} className="btn btn-primary">
            {room.toUpperCase()}
          </button>
        ))}
      </div>
      <Room name={activeRoom} />
    </div>
  );
}

export default SmartHome;