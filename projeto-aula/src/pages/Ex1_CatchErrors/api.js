export const fetchCatError = (statusCode) => {
  return (
    fetch(`/cat_api/${statusCode}`)
    .then(response => {
      if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`);
      return `https://http.cat/${statusCode}`; 
    })
    .catch(error => {console.error("Erro ao buscar imagem:", error)})
  );
};
