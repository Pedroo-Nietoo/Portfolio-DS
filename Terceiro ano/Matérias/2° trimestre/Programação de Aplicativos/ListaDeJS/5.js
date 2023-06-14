let num1 = parseInt(prompt('Digite um número positivo a ser multiplicado:'));
let num2 = parseInt(prompt('Digite um número positivo para multiplicar:'));

function multiplicar(num1, num2) {
  let resultado = 0;

  for(let i = 0; i < num2; i++) {
    resultado += num1;
  }
  return resultado;
}

if (num1 < 0 || num2 < 0) {
  alert('Um dos números é negativo');
} else {
  let resultado = multiplicar(num1, num2);
  alert('O resultado da multiplicação é: ' + resultado);
}