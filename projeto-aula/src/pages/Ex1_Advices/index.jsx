import Header from '../../components/Ex1_Advices/Header';
import Footer from '../../components/Ex1_Advices/Footer';
import Form from '../../components/Ex1_Advices/Form';
import styles from './Advices.module.css';

function Advices() {

    return (
        <>
            <Header/>
            <main className={styles.container}>
                <section className={styles.generate}>
                    <div className={styles.content}>
                        <Form/>
                        <div className={styles.response}>
                            <h1>Resultado</h1>
                        </div>
                    </div>
                </section>
            </main>
            <Footer/>
        </>
    )
}

export default Advices;