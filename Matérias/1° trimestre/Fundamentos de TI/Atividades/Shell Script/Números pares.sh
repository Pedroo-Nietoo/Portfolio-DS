#!/bin/bash
read -p "Digite um número: " num

for varrer in $( seq 0 1 $num )  
do
	if [ $(($varrer%2)) -eq 0 ]
	then
		echo $varrer
	fi
done

