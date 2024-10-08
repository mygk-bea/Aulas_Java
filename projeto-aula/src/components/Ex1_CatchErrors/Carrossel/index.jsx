import React, { useEffect, useRef, useState } from 'react';
import styles from './Carrossel.module.css';
import cat1 from '../../../assets/images/cat1.jpg';
import cat2 from '../../../assets/images/cat2.jpg';
import cat3 from '../../../assets/images/cat3.jpg';
import cat4 from '../../../assets/images/cat4.jpg';

function Carrossel() {
  const images = [cat1, cat2, cat3, cat4];
  const [currentIndex, setCurrentIndex] = useState(0);
  const slideBoxRef = useRef(null);

  useEffect(() => {
    const autoSlide = setInterval(() => {
      setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
    }, 3500);

    return () => clearInterval(autoSlide);
  }, [images.length]);

  return (
    <section className={styles.showSlides}>
      <div className={styles.welcome}>
        <p>Bem-vindo(a)!</p>
        <p>Encontre erros HTTP junto com gatos! 🐈</p>
      </div>
      <div className={styles.carrossel}>
        <div className={styles.slide}>
          <ul 
            className={styles.slide__box} 
            style={{ 
              transform: `translateX(-${currentIndex * 100}%)`,
              transition: currentIndex === 0 ? 'none' : 'transform 0.8s ease-out'
            }}
            ref={slideBoxRef}
          >
            {images.map((image, index) => (
              <li key={index} className={styles.slide__each}>
                <img src={image} alt={`slide-${index}`} />
              </li>
            ))}
          </ul>
        </div>
      </div>
    </section>
  );
}

export default Carrossel;