import { NavLink } from 'react-router-dom';
import styles from './Card.module.css';

function Card(props) {
  return (
    <NavLink to={props.rota}>
      <div className={styles.card}>
        <h3>{ props.nome }</h3>
        <div className={styles.info}>
          <p>{ props.aula }</p>
          <p>Data: { props.data }</p>
        </div>
        <span className={styles.tipo} style={{background: props.tipo}}></span>
      </div>
    </NavLink>
  )
}

export default Card;