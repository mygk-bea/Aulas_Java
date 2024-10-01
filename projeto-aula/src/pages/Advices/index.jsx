import FooterAdvice from '../../components/Advices/Footer';
import FormAdvice from '../../components/Advices/Form';
import HeaderAdvice from '../../components/Advices/Header';
import './Advices.css';

function Advices() {

    return (
        <>
            <HeaderAdvice/>
            <main className='container_advices'>
                <section className="generate_advices">
                    <div className="content">
                        <FormAdvice/>
                        <div className="response">
                            <h1>Resultado</h1>
                        </div>
                    </div>
                </section>
            </main>
            <FooterAdvice/>
        </>
    )
}

export default Advices;