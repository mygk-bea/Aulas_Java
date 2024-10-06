import ColorSwitch from "../../components/Ex3_Inputs/ColorSwitch";
import FeedbackButton from "../../components/Ex3_Inputs/FeedbackButton";
import FeedbackForm from "../../components/Ex3_Inputs/FeedbackForm";
import Form from "../../components/Ex3_Inputs/Form";
import Gallery from "../../components/Ex3_Inputs/Gallery";
import LightSwitch from "../../components/Ex3_Inputs/LightSwitch";
import styles from './Inputs.module.css';
import { NavLink } from 'react-router-dom';
import { IconBackPage } from '../../assets/icons/IconBackPage';
import { useState } from "react";

function ExInputs() {

    // Variável de Estado para alterar o fundo apenas da main, para não afetar as outras páginas
    const [backgroundColor, setBackgroundColor] = useState('');
    function handleColorChange() {
        if(backgroundColor == 'lightgreen') {
            setBackgroundColor('');
        } else {
            setBackgroundColor('lightgreen');
        }
    }

    return (
        <>
            <header className={styles.header}>
                <div className={styles.logo}>
                    Exercícios Inputs
                </div>
                <nav>
                    <NavLink to="/">
                        Voltar Para Projetos
                        <IconBackPage/>
                    </NavLink>
                </nav>
            </header>

            <div className={styles.main} style={{ backgroundColor }}>
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