import './Form.css';

function FormAdvice() {
  return (
    <form action="">
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
        <label htmlFor="">nome_label</label>
        <select name="" id="">
          <option value=""></option>
        </select>
      </div>

      <div className="btn_form">
        <button>Enviar</button>
      </div>
    </form>
  )
}

export default FormAdvice;