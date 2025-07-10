import React, { useState } from "react";
import accessories from "./data";

function Room({ name }) {
  const data = accessories[name];
  const [states, setStates] = useState(data.items.map(() => false));

  const toggleDevice = (index, value) => {
    const newStates = [...states];
    newStates[index] = value;
    setStates(newStates);
  };

  return (
    <div className="p-4">
      <fieldset>
        <h3>{data.usage}Kwh</h3>
        <h3>Power Usage For Today</h3>
      </fieldset>
      <br />
      <fieldset>
        <h2>ACCESSORIES</h2>
        <div className="d-flex flex-wrap justify-content-center">
          {data.items.map((item, i) => (
            <div key={i} className="card m-2 text-center" style={{ width: "16rem" }}>
              <img
                src={item.img}
                alt={item.title}
                className="card-img-top p-4"
                style={{
                  height: "180px",
                  filter: states[i] ? "brightness(1.5) saturate(2)" : "grayscale(0.5)",
                  transition: "0.3s"
                }}
              />
              <div className="card-body">
                <h4 className="card-title">{item.title}</h4>
                <p className="card-text">STATUS</p>
                <button
                  className="btn btn-success me-2"
                  onClick={() => toggleDevice(i, true)}
                >
                  ON
                </button>
                <button
                  className="btn btn-outline-danger"
                  onClick={() => toggleDevice(i, false)}
                >
                  OFF
                </button>
              </div>
            </div>
          ))}
        </div>
      </fieldset>
      <br />
      <fieldset><h4>HUMIDITY</h4>{data.humidity}%</fieldset>
      <br />
      <fieldset><h4>INTERNET</h4>{data.internet} mbps</fieldset>
      <br />
      <fieldset><h3>Current Temperature</h3>{data.temp}°C</fieldset>
    </div>
  );
}

export default Room;
 