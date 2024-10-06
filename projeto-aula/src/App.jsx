import './App.css';
import { Route, Routes } from 'react-router-dom'

import Home from './pages/Home'
import Advices from './pages/Ex1_Advices'
import ExLists from './pages/Ex2_Lists'
import ExInputs from './pages/Ex3_Inputs'

function App() {
  return (
    <>
      <Routes>
        <Route Component={ Home }  path="/"></Route>
        <Route Component={ Advices }  path="/conselhos"></Route>
        <Route Component={ ExLists }  path="/listas-exercicio"></Route>
        <Route Component={ ExInputs }  path="/inputs-exercicio"></Route>
      </Routes>
    </>
  )
}

export default App
