import ColorSwitch from "../../components/Inputs/ColorSwitch";
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
            <Gallery/>
        </>
    );
}

export default ExInputs;