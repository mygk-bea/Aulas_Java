import { useState } from "react";
import { sculptureList } from "./data";


export default function Gallery() {
    const [index, setIndex] = useState(0);
    const [showMore, setShowMore] = useState(false);
    const [isNextDisabled, setIsNextDisabled] = useState(false);
    const [isBackDisabled, setIsBackDisabled] = useState(true);

    function handleNextClick() {
        setIndex(index+1);
        if(index+2 == sculptureList.length) setIsNextDisabled(!isNextDisabled);
        if(index+1 != 0) setIsBackDisabled(false);
    }

    function handleBackClick() {
        setIndex(index-1);
        if(index == 1) setIsBackDisabled(true);
        if(index+2 != sculptureList.length) setIsNextDisabled(false);
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
                <i>{sculpture.name}</i> by {sculpture.artist}
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