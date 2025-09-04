package ejemplo3_repaso_metodos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*3. Crea un método que reciba un string y retorne la cantidad de vocales que contiene. */
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

    System.out.println("La palabra \"" + palabra + "\" tiene " + contadorVocales + " vocal(es).");
    }
}