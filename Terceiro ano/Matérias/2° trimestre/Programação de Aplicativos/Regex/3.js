const texto = "ABCDEFg";
const regex = /^[A-Z]+$/;

const validaCaracteres = regex.test(texto);

console.log(validaCaracteres);

//Nesse caso, dará 'false' por conta da presença do 'g' no final.
