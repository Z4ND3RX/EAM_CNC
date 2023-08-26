#!/bin/bash

variable=${1}

mensaje() {
echo "Hackeando la nasa ....."
echo "cachasteeeeeee ...."
echo "ip xx.x.xxx.xxx"
echo "el número ingresado es: "$variable
}

fecha() {
echo "esperando la fecha"
date
}

echo ""

#Documentación
#Leer el archivo de los usuarios
cat /etc/passwd

mensaje
fecha
