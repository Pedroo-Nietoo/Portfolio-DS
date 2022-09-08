#!/bin/bash
echo "Digite o diretório cujos componentes deseja listar:" #Printa no terminal o texto entre aspas.
read dir #Lê o diretório escrito pelo usuário e o armazena na variável "dir".
echo "" #Printa no terminal o texto entre aspas.
echo "Os componentes deste diretório são:" #Printa no terminal o texto entre aspas.
ls -a $dir #Lista todos os itens do diretório (ocultos incluídos).
