import React from "react";
import "./styles.css";

function Login({ onLogin }) {
  return (
    <div className="login-container">
      <h1>SMART HOME</h1>
      <fieldset>
        <legend>LOGIN FORM</legend>
        <label>EMAIL ID:</label>
        <input type="email" /><br /><br />
        <label>PASSWORD:</label>
        <input type="password" /><br /><br />
        <img
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiRQY9lGQZXCiKdjenJRcZ7OcoJHn77l2F3w&usqp=CAU"
          width="500"
          alt="Smart Home"
        />
        <br /><br />
        <button onClick={onLogin}>LOGIN</button>
      </fieldset>
    </div>
  );
}

export default Login;