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





       
        /*1. Imprimir todos los números pares entre 1 y 100.*/
        Scanner sc = new Scanner(System.in);

        int i =1;

        while (i<101){
            if (i % 2 == 0) { // Verifica si es par
                System.out.println(i);
            }
            
            i++;
            
        }

        /*2. Mostrar la tabla de multiplicar de cualquier número ingresado por el usuario. */

        

        






    }
}