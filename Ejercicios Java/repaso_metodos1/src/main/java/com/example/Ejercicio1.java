package com.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

    /*1. Crea un método que reciba un número entero y retorne true si es primo 
    y false en caso  contrario. */


   /*  Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int num = sc.nextInt();

    int divisores =0;

    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            divisores++;
        }
    }

    if (divisores == 2) {
        System.out.println("El numero " + num + " SI es primo");
    } else {
        System.out.println("El numero " + num + " NO es primo");
    }*/

/*2. Crea un método que reciba un arreglo de enteros y devuelva el mayor valor.  

    int[] numeros = {5, 8, 1, 2, 6};

    int mayor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > mayor) {
            mayor = numeros[i];
     }
    }   

    System.out.println("El mayor valor en el arreglo es: " + mayor);*/

    /*3. Crea un método que reciba un string y retorne la cantidad de vocales que contiene. 
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe una palabra: ");
    String palabra = sc.next().toLowerCase();

    int contadorVocales = 0;
    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contadorVocales++;
        }
    }

    System.out.println("La palabra \"" + palabra + "\" tiene " + contadorVocales + " vocal(es).");*/

    /*4. Diseña un método que reciba dos números y retorne el máximo común divisor (MCD).
     Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

       
        int a = num1;
        int b = num2;

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        System.out.println("El MCD de " + a + " y " + b + " es: " + num1);*/

        /*5. Implementa un método que reciba un número entero y retorne su factorial. 
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);*/

        /*1. Imprimir todos los números pares entre 1 y 100.*/
        Scanner sc = new Scanner(System.in);

        int i =1;

        while (i<101){
            if (i % 2 == 0) { 
                System.out.println(i);
            }
            
            i++;
            
        }


        

        






    }
}
