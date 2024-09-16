import './App.css'
import { Route, Routes } from 'react-router-dom'

import Home from './pages/Home'
import Advices from './pages/Advices'

function App() {
  return (
    <>
      <Routes>
        <Route Component={ Home }  path="/"></Route>
        <Route Component={ Advices }  path="/conselhos"></Route>
      </Routes>
    </>
  )
}

export default App
