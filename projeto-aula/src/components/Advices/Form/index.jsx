import { useState } from 'react';
import './Form.css';

function FormAdvice() {
  // let url = "https://api.adviceslip.com/";

  // url += (typeAdvice == 1) ? "advice": "daily_adviceslip.rss";

  // fetch(url)
  // .then(response => response.json())
  // .then(dados => {
  //   console.log(dados)
  //   console.log(dados.slip.advice)
  // });

  // const [nome, setnome] = useState('');
  // const [typeAdvice, setTypeAdvice] = useState('');

  return (
    <form>
      <h1>Título</h1>

      <div className="input_form">
        <label htmlFor="">nome_label</label>
        <input type="text" id=''/>
      </div>
      <div className="input_form">
        <label htmlFor="">nome_label</label>
        <textarea name="" id=""></textarea>
      </div>
      <div className="input_form">
        <label htmlFor="">Escolha o tipo de conselho: </label>
        <select name="" id="" placeholder="Selecione...">
          <option value="1"></option>
          <option value="2"></option>
        </select>
      </div>

      <div className="btn_form">
        <button>Enviar</button>
      </div>
    </form>
  )
}

export default FormAdvice;