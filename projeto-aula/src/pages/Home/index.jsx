import styles from './Home.module.css';
import Card from '../../components/General/Card';

function Home() {
  return (
    <main className={styles.home}>
      <div className={styles.container}>
        <h1>Projetos</h1>
        <div className={styles.content}>
          <Card nome="Exercício 3 - Inputs" aula="Aula 9" data="23/09/2024" rota="/inputs-exercicio"/>
          <Card nome="Exercício 2 - Listas" aula="Aula 8" data="16/09/2024" rota="/listas-exercicio"/>
          <Card nome="Exercício 1 - Aprenda Erros HTTP!" aula="Aula 7" data="09/09/2024" rota="/gatos-http"/>
        </div>
      </div>
    </main>
  )
}

export default Home;