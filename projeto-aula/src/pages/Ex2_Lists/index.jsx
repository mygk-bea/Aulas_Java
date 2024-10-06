import List from '../../components/Ex2_Lists/List';
import Poem from '../../components/Ex2_Lists/Poem';
import RecipeList from '../../components/Ex2_Lists/RecipeList';
import TodoList from '../../components/Ex2_Lists/TodoList';
import { NavLink } from 'react-router-dom';
import { IconBackPage } from '../../assets/icons/IconBackPage';
import styles from './Lists.module.css';

function ExLists() {
    return (
        <>
            <header className={styles.header}>
                <div className={styles.logo}>
                    Exercícios Listas
                </div>
                <nav>
                    <a href="#exercicio1">Exercício 1</a>
                    <a href="#exercicio2">Exercício 2</a>
                    <a href="#exercicio3">Exercício 3</a>
                    <a href="#exercicio4">Exercício 4</a>
                    <NavLink to="/">
                        Voltar Para Projetos
                        <IconBackPage/>
                    </NavLink>
                </nav>
            </header>

            <div className={styles.main}>
                <div id="exercicio1"><TodoList /></div>
                <div id="exercicio2"><List /></div>
                <div id="exercicio3"><RecipeList /></div>
                <div id="exercicio4"><Poem /></div>
            </div>
        </>
    );
}

export default ExLists;