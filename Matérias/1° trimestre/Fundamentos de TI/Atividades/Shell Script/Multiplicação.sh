#!/bin/bash
read -p "Antes da multiplicação, selecione o arquivo em que deseja salvar a multiplicação:" arq
#Lê o nome do arquivo escrito pelo usuário e o armazena na variável "arq".
#Printa no terminal o que está escrito entre aspas

read -p "Digite o primeiro número: " num1
#Lê o número escrito pelo usuário no terminal e o armazena na variável "num1".
#Printa no terminal o texto entre aspas.

read -p "Digite o segundo número: " num2
#Lê o número escrito pelo usuário no terminal e o armazena na variável "num2".
#Printa no terminal o texto entre aspas.

resultado=$(($num1*$num2)) #Cria a variável "resultado", que tem como valor a multiplicação de "num1" por "num2".
echo "" #Printa no terminal o texto entre aspas.
 
echo "A multiplicação de $num1 e $num2 é: $resultado" >> $arq
#Printa no terminal o texto entre aspas. Os textos com "$" antes são as variáveis, as quais aparecem junto com o texto no comando "echo".
#Envia a frase do comando "echo" para dentro do arquivo na variável "arq".

echo "" #Printa no terminal o texto entre aspas.
echo "O arquivo se encontra assim:" #Printa no terminal o texto entre aspas.
cat -n $arq #Lê o arquivo armazenado na variável "arq" e mostra a quantidade de linhas do mesmo.
