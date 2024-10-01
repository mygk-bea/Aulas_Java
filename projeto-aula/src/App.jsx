import './App.css'
import { Route, Routes } from 'react-router-dom'

import Home from './pages/Home'
import Advices from './pages/Advices'
import ExLists from './pages/Lists'
import ExInputs from './pages/Inputs'

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
