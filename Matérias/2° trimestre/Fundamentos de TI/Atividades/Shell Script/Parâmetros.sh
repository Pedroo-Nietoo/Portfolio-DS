#!/bin/bash
echo "Bom dia! Qual é o seu nome?" #Printa no terminal o texto entre aspas.
nome=$(whoami) #Cria uma variável chamada "nome" que tem como valor o comando "whoami".
echo "" #Printa no terminal o texto entre aspas.
echo "Olá, $nome" #Printa #Printa no terminal o texto entre aspas junto com a variável "nome".

#Enviar parâmetros para o script faz com que as variáveis sejam fixas, não podendo ser definidas na hora pelo usuário do script.
