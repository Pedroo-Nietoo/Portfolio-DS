function converterIdadeEmDias(idade) {
    return idade * 365;
}

let idade = parseInt(prompt("Quantos anos você tem?\nEx: 17"));

let resultado = converterIdadeEmDias(idade);
console.log(`Você já viveu ${resultado} dias`);
