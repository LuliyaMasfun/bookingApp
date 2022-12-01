import "./App.css";
import Register from "./components/molecule/Register";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import LoginPage from "./components/molecule/LoginPage";
function App() {
  return (
    <Router>
      <nav>
        <Link to="/">HOME</Link>
        <Link to="/register"> Register</Link>
        <Link to="/about"> About</Link>
      </nav>
      <Routes>
        <Route path="/" element={<LoginPage />} />
        <Route path="register" element={<Register />} />
      </Routes>
    </Router>
  );
}

export default App;
