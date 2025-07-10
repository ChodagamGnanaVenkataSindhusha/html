import React, { useState } from "react";
import Login from "./Login";
import SmartHome from "./SmartHome";

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return loggedIn ? <SmartHome /> : <Login onLogin={() => setLoggedIn(true)} />;
}

export default App;