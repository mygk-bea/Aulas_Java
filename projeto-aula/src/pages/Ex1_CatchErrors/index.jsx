import { useEffect, useState } from 'react';
import Header from '../../components/Ex1_CatchErrors/Header';
import Footer from '../../components/Ex1_CatchErrors/Footer';
import Form from '../../components/Ex1_CatchErrors/Form';
import styles from './CatchErrors.module.css';
import { fetchCatError } from './api';

function CatchErrors() {
  const [catUrl, setCatUrl] = useState('');
  const [statusCode, setStatusCode] = useState(0);
  const [errorDescription, setErrorDescription] = useState('');
  const [errorExplanation, setErrorExplanation] = useState('');

  useEffect(() => {
    fetchCatError(statusCode)
    .then(imageUrl => {if (imageUrl) setCatUrl(imageUrl)});
  }, [statusCode]);


  const handleDataUpdate = (data) => {
    const { error, description, explanation } = data;

    setStatusCode(error);
    setErrorDescription(description); 
    setErrorExplanation(explanation); 
  }

  return (
    <>
      <Header />
      <main className={styles.container}>
        <section className={styles.generate}>
          <div className={styles.form}>
            <Form registeredData={handleDataUpdate}/>
          </div>
          <div className={styles.response}>
            <h1>Código {statusCode}</h1>
            <div className={styles.catImage}>
              {catUrl && <img src={catUrl} alt={`Erro ${statusCode}`} />}
              <div className={styles.description}>
                <h3>{errorDescription} </h3>
                {errorExplanation && <p>{errorExplanation}</p>}
              </div>
            </div>
          </div>
        </section>
        <section className={styles.slides}>
          
        </section>
      </main>
      <Footer />
    </>
  );
}

export default CatchErrors;
