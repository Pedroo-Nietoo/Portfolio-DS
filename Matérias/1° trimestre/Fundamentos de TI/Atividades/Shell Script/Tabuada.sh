#!/bin/bash
mult=0

read -p "Digite um número: " num

while [ $mult -lt 10 ]
do
	mult=$(($mult+1))
	res=$(($num*$mult))
	echo "$num vezes $mult é: $res"
done	
