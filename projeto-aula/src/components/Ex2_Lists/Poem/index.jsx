import styles from './Poem.module.css';

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
      <div className={styles.poem}>
        {poem.lines.map((line, index) => 
          <p key={index}>
            {line}
          </p>
        )}
      </div>
    </article>
  );
}