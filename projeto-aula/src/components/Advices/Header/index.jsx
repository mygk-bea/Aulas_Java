import { NavLink } from 'react-router-dom';
import './HeaderAdvice.css';
import { IconLogo } from '../../../assets/icons/IconLogoAdvices';
import { IconBackPage } from '../../../assets/icons/IconBackPage';

function HeaderAdvice() {
    return (
        <header className='header_advice'>
            <div className="logo">
                <IconLogo/>
                <p>GanheUmConselho</p>
            </div>
            <nav>
                <NavLink to="/">
                    Voltar Para Projetos
                    <IconBackPage/>
                </NavLink>
            </nav>
        </header>
    )
}

export default HeaderAdvice;