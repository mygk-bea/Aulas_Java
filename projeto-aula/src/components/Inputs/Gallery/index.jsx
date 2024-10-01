import { useState } from "react";
import { sculptureList } from "./data";


export default function Gallery() {
    const [index, setIndex] = useState(0);
    const [showMore, setShowMore] = useState(false);
    const [isNextDisabled, setIsNextDisabled] = useState(false);
    const [isBackDisabled, setIsBackDisabled] = useState(true);

    function handleNextClick() {
        if(index+1 == sculptureList.length) {
            setIsNextDisabled(!isNextDisabled);
        } else setIndex(index +1);
        if(index == 0) {
            setIsBackDisabled(!isBackDisabled);
        }
        console.log(index)
    }

    function handleBackClick() {
        if(index == 0) {
            setIsBackDisabled(!isBackDisabled);
        } else setIndex(index -1);
        
        if(index+1 < sculptureList.length) {
            setIsNextDisabled(!isNextDisabled);
        }
        console.log(index)  
    }

    function handleMoreClick() {
        setShowMore(!showMore);
    }

    let sculpture = sculptureList[index];

    return (
        <>
            <button onClick={handleNextClick} disabled={isNextDisabled}>Next</button>
            <button onClick={handleBackClick} disabled={isBackDisabled}>Back</button>

            <h2>
                <i>{sculpture.name}</i>
                by {sculpture.artist}
            </h2>
            <h3>
                ({index +1} of {sculptureList.length})
            </h3>

            <button onClick={handleMoreClick}>
                {showMore ? 'Hide' : 'Show'} details
            </button>
            {showMore && <p>{sculpture.description}</p>}
            <img src={sculpture.url} alt={sculpture.alt} />
        </>
    );
}