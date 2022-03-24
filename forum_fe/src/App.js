// import logo from './logo.svg';
import './App.css';
import Login from './page/Login';
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom';
import Register from './page/Register';

function App() {
  return (
    <Router>
        <Routes>
          <Route path="/" element={<Login/>}></Route>
          <Route path="/register" element={<Register/>}></Route>
         
   
        </Routes>
    </Router>
  );
}

export default App;
