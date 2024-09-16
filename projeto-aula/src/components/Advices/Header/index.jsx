import { NavLink } from 'react-router-dom';
import './HeaderAdvice.css';

function HeaderAdvice() {
    return (
        <header className='header_advice'>
            <div className="logo">
                <img src="" alt="" />
                <p>GanheUmConselho</p>
            </div>
            <nav>
                <NavLink to="/">Voltar Para Projetos</NavLink>
            </nav>
        </header>
    )
}

export default HeaderAdvice;