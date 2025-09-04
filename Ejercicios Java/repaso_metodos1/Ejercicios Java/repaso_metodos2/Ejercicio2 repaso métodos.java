package com.example;

public class Main {
    public static void main(String[] args) {
       /*2. Crea un método que reciba un arreglo de enteros y devuelva el mayor valor.*/  

    int[] numeros = {5, 8, 1, 2, 6};

    int mayor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > mayor) {
            mayor = numeros[i];
     }
    }   

    System.out.println("El mayor valor en el arreglo es: " + mayor);
    }
}