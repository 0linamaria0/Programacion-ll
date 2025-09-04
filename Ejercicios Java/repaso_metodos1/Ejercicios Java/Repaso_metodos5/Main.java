import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*5. Implementa un método que reciba un número entero y retorne su factorial. */
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}