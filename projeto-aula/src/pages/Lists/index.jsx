import List from '../../components/Lists/List';
import Poem from '../../components/Lists/Poem';
import RecipeList from '../../components/Lists/RecipeList';
import TodoList from '../../components/Lists/TodoList';
import { NavLink } from 'react-router-dom';
import { IconBackPage } from '../../assets/icons/IconBackPage';
import './Lists.css';

function ExLists() {
    return (
        <>
            <header className='header'>
                <div className="logo">
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

            <div className='main'>
                <div id="exercicio1"><TodoList /></div>
                <div id="exercicio2"><List /></div>
                <div id="exercicio3"><RecipeList /></div>
                <div id="exercicio4"><Poem /></div>
            </div>
        </>
    );
}

export default ExLists;