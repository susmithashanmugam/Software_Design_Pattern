import React  from "react";
// import { Button } from "@/components/ui/button"
// import { ModeToggle } from './components/mode-toggle'
// import {GridPattern} from './components/magicui/animated-grid-pattern'

import { BrowserRouter,Routes,Route } from "react-router-dom";
import Weblayout from "./layout/Weblayout";
import Home from "./pages/Web/Home";
import Login from "./pages/Web/Login";
import Register from "./pages/Web/Register";
import Notfound from "./pages/Web/Notfound";
export default function App() {
    return (
    
    <>
    <BrowserRouter>
        <Routes>
          <Route element={<Weblayout/>}>
          <Route path='/' element={<Home/>}/>
          <Route path='/login' element={<Login/>}/>
        
          <Route path='/register' element={<Register/>}/>
          <Route path='*' element={<Notfound/>}/>
        </Route>
        </Routes>
        </BrowserRouter>

      </>
          );
  }
