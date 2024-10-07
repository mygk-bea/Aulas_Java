import { NavLink } from 'react-router-dom';
import  styles from './Header.module.css';
import { IconLogo } from '../../../assets/icons/IconLogoCat';
import { IconBackPage } from '../../../assets/icons/IconBackPage';

function Header() {
    return (
        <header className={styles.header}>
            <div className={styles.logo}>
                <IconLogo/>
                <p>GatosHTTP</p>
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

export default Header;