import './Home.css';
import Card from '../Card';

function Home() {
  return (
    <div className='home container'>
      <h1>Projetos</h1>
      <div className="content">
        <Card nome="Herança encapsulamento" aula="Aula 2" data="16-09-2024"/>
      </div>
    </div>
  )
}

export default Home;