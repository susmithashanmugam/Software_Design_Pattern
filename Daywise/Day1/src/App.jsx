import React  from "react";
import { Button } from "@/components/ui/button"
import { ModeToggle } from './components/mode-toggle'
import {GridPattern} from './components/magicui/animated-grid-pattern'
const App=()=> {
    return (
        <>
      <div className='h-screen w-screen flex justify-center' >
         world!
         <GridPattern/>
         <ModeToggle />
      </div>
      
      </>
    )
  }
  export default App;