import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       /*4. Diseña un método que reciba dos números y retorne el máximo común divisor (MCD).*/
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

        System.out.println("El MCD de " + a + " y " + b + " es: " + num1);
    }
}
