import { useState } from 'react';
import { httpErrorsExplanation } from '../../../pages/Ex1_CatchErrors/data';
import styles from './Form.module.css';

function Form(props) {
  const [error, setError] = useState('');
  const [description, setDescription] = useState('');
  const [explanation, setExplanation] = useState('');
  const [selectedCode, setSelectedCode] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    props.registeredData({
      error,
      description,
      explanation
    });

    setError('');
    setDescription('');
    setExplanation('');
    setSelectedCode('');
  }

  const handleChange = (event) => {
    const selectedCode = event.target.value; 
    const selectedError = httpErrorsExplanation.find(error => error.code == selectedCode);

    if (selectedError) {
      setDescription(selectedError.description);
      setExplanation(selectedError.explanation);
    }

    setError(selectedCode);
    setSelectedCode(selectedCode);
  }

  return (
    <div className={styles.form}>
      <form onSubmit={handleSubmit}>
        <h1>Encontre um Gatinho</h1>

        <div className={styles.input_form}>
          <label>Escolha o código de status: </label>
          <select value={selectedCode} onChange={handleChange} required>
            <option value="" hidden>Selecione...</option>
            {httpErrorsExplanation.map(error => (
              <option key={error.code} value={error.code}>{`${error.code}`}</option>
            ))}
          </select>
        </div>

        <div className={styles.input_form}>
          <label>Descrição: </label>
          <input type="text" id='' value={description} readOnly/>
        </div>

        <div className={styles.input_form}>
          <label>Explicação: </label>
          <textarea name="" id="" value={explanation} readOnly></textarea>
        </div>

        <div className={styles.btn_form}>
          <button type='submit'>Enviar</button>
        </div>
      </form>
    </div>
  )
}

export default Form;