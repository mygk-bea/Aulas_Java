import ColorSwitch from "../../components/Inputs/ColorSwitch";
import FeedbackButton from "../../components/Inputs/FeedbackButton";
import FeedbackForm from "../../components/Inputs/FeedbackForm";
import Form from "../../components/Inputs/Form";
import Gallery from "../../components/Inputs/Gallery";
import LightSwitch from "../../components/Inputs/LightSwitch";
import { NavLink } from 'react-router-dom';
import { IconBackPage } from '../../assets/icons/IconBackPage';
import '../Lists/Lists.css';
import './Inputs.css';

function ExInputs() {
    function handleColorChange() {
        document.body.style.backgroundColor = 'lightgreen';
    }

    return (
        <>
            <header className='header'>
                <div className="logo">
                    Exercícios Inputs
                </div>
                <nav>
                    <NavLink to="/">
                        Voltar Para Projetos
                        <IconBackPage/>
                    </NavLink>
                </nav>
            </header>

            <div className='main main_inputs'>
                <div id="exercicio1">
                    <h3>Ex 1.</h3>
                    <LightSwitch />
                </div>
                <div id="exercicio2">
                    <h3>Ex 2.</h3>
                    <ColorSwitch onChangeColor={handleColorChange} />
                </div>
                <div id="exercicio3">
                    <h3>Ex 3.</h3>
                    <Gallery />
                </div>
                <div id="exercicio4">
                    <h3>Ex 4.</h3>
                    <Form />
                </div>
                <div id="exercicio5">
                    <h3>Ex 5.</h3>
                    <FeedbackForm />
                </div>
                <div id="exercicio6">
                    <h3>Ex 6.</h3>
                    <FeedbackButton />
                </div>
            </div>
        </>
    );
}

export default ExInputs;