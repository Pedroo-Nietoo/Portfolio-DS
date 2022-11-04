#!/bin/bash
read -p "Digite dois valores: " valor1
read valor2
if [ $valor1 -gt $valor2 ]
then
	echo "O valor $valor1 é o maior."

else
	echo "O valor $valor2 é o maior."
fi

resultado=$(($valor1+$valor2))
echo "A soma de $valor1 e $valor2 é $resultado"
