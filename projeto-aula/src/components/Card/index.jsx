import { NavLink } from 'react-router-dom';
import './Card.css';

function Card(props) {
  return (
    <NavLink to={props.rota}>
      <div className='card'>
        <h3>{ props.nome }</h3>
        <div className="info">
          <p>{ props.aula }</p>
          <p>Data: { props.data }</p>
        </div>
        <span className="tipo" style={{background: props.tipo}}></span>
      </div>
    </NavLink>
  )
}

export default Card;