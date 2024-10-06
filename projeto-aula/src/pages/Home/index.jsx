import styles from './Home.module.css';
import Card from '../../components/General/Card';

function Home() {
  return (
    <main className={styles.home}>
      <div className={styles.container}>
        <h1>Projetos</h1>
        <div className={styles.content}>
          <Card nome="Exercício - Inputs" aula="Aula 9" data="23/09/2024" rota="/inputs-exercicio"/>
          <Card nome="Exercício - Listas" aula="Aula 8" data="16/09/2024" rota="/listas-exercicio"/>
          <Card nome="Trabalho - Ganhe um Conselho!" aula="Aula 7" data="09/09/2024" rota="/conselhos"/>
        </div>
      </div>
    </main>
  )
}

export default Home;