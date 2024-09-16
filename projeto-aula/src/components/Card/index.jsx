import './Card.css';

function Card(props) {
  return (
    <div className='home card'>
      <h3>{ props.nome }</h3>
      <div className="info">
        <p>{ props.aula }</p>
        <p>{ props.data }</p>
      </div>
      <span className="tipo" style={{background: props.tipo}}></span>
    </div>
  )
}

export default Card;