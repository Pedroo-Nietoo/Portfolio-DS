#!/bin/bash
clear
echo "Selecione a opção que deseja realizar:"
echo "1 - Status da utilização das partições do sistema"
echo "2 - Relação de usuários logados"
echo "3 - Data e hora"
echo "4 - Sair"
read opcao

if [ $opcao -eq 1 ]
then
	echo ""
	echo "Status da utilização de partições do sistema:"
	df -h

elif [ $opcao -eq 2 ]
then
	echo ""
	echo "Relação de usuários logados:"
	whoami

elif [ $opcao -eq 3 ]
then
	echo ""
	echo "Data e hora"
	date

elif [ $opcao -eq 4 ] 
then
	exit

else
	echo "Parâmetro inválido. Selecione uma das opções"

fi
