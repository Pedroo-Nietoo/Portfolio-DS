#!/bin/bash
while true
do
	read -p "Digite um valor (4 para sair)" var
	if [ $var -eq 4 ]
	then
		break
	else
		echo "Você digitou $var"
	fi
done
