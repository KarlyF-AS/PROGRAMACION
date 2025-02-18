package BOLETINES.src.boletin3;

import java.util.Scanner;
/**
 * Cuando se inserte un número positivo se muestre "¡El número es positivo!",
 de lo contrario que continue el bucle hasta que se cumpla la condición
 * @version 1.0
 * @author Karly Albarrán
 */
public class eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Escribe el número: ");
        numero = sc.nextInt();

        do {
            System.out.println("Escribe el número: ");
            numero = sc.nextInt();

            if (numero > 1){
                System.out.println("¡El número es positivo!");
            }else {
                System.out.println("El número no es positivo, vuelve a intentarlo");
            }
        }while (numero < 1);
    }
}