import './Poem.css';

const poem = {
  lines: [
    'I write, erase, rewrite',
    'Erase again, and then',
    'A poppy blooms.'
  ]
};

export default function Poem() {
  return (
    <article>
      <div className='poem'>
        {poem.lines.map((line, index) => 
          <p key={index}>
            {line}
          </p>
        )}
      </div>
    </article>
  );
}