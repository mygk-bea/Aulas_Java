import './Home.css';
import Card from '../../components/Card';

function Home() {
  return (
    <main className='home'>
      <div className='container'>
        <h1>Projetos</h1>
        <div className="content">
          <Card nome="Ganhe um Conselho!" aula="Aula 7" data="09/09/2024" rota="/conselhos"/>
        </div>
      </div>
    </main>
  )
}

export default Home;