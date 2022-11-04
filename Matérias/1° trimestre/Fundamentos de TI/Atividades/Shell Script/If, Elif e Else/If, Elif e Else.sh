#!/bin/bash
if [ $# -eq 1 ]
then
	if [ $1 -gt 10 ]
	then
		echo "O valor $1 é maior que 10."
	elif [ $1 -eq 10 ]
	then
		echo "os valores são iguais."
	else
		echo "O valor $1 é menor que 10."
	fi

else
	echo "Quantidade de parâmetros incorreta."
fi
