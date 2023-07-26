const texto = "O rato achou seu amigo rato e juntos roeram a roupa do rei de Roma";
const palavra = "rato";

const regex = new RegExp(palavra, 'g');
const palavrasEncontradas = texto.match(regex);

let quantidade;
if (palavrasEncontradas) {
  quantidade = palavrasEncontradas.length;
} else {
  quantidade = 0;
}

console.log(`A palavra "${palavra}" aparece ${quantidade} vezes no texto.`);
