import './List.css';
import { people } from './data.js';
import { getImageUrl } from './utils.js';

export default function List() {
    const chemists = people.filter(person => person.profession === 'chemist');
    const other_professions = people.filter(person => person.profession !== 'chemist');

    const listItems = (list) => list.map(person => 
        <li key={person.id} className='list_item'>
            <div className="inner">
                <img 
                    src={getImageUrl(person)}
                    alt={person.name}
                />
            </div>
            <p>
                <b>{person.name}:</b>
                {' ' + person.profession + ' '}
                known for {person.accomplishment}
            </p>
        </li>
    );

    return (
        <article>
            <h1>Scientists</h1>
            <h3>Químicos</h3>
            <ul>{listItems(chemists)}</ul>

            <h3>Outras Profissões</h3>
            <ul>{listItems(other_professions)}</ul>
        </article>
    );
}