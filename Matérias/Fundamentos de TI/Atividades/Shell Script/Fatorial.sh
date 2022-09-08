#!/bin/bash
fatorial=1
read -p "Digite um número: " num

for (( i=1; i <= $num ; i++ ))
do
    fatorial=$(($fatorial*$i))
done

echo "O fatorial de $num é: $fatorial "
