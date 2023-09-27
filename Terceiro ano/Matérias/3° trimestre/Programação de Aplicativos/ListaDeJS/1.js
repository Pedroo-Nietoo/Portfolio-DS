let num1 = parseInt(prompt("Digite o primeiro número:"))
let num2 = parseInt(prompt("Digite o segundo número:"))

if(num1 > num2){
    alert(`${num1} é maior que ${num2}`);
} else if(num1 == num2){
    alert(`${num1} é igual a ${num2}`);
} else {
    alert(`${num1} é menor que ${num2}`);
}