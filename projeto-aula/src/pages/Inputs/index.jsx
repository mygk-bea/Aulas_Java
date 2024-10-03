import ColorSwitch from "../../components/Inputs/ColorSwitch";
import FeedbackButton from "../../components/Inputs/FeedbackButton";
import FeedbackForm from "../../components/Inputs/FeedbackForm";
import Form from "../../components/Inputs/Form";
import Gallery from "../../components/Inputs/Gallery";
import LightSwitch from "../../components/Inputs/LightSwitch";

function ExInputs() {
    function handleColorChange() {
        document.body.style.backgroundColor = 'lightgreen';
    }

    return (
        <>
            <LightSwitch />
            <ColorSwitch onChangeColor={handleColorChange} />
            <Gallery />
            <Form />
            <FeedbackForm />
            <FeedbackButton />
        </>
    );
}

export default ExInputs;