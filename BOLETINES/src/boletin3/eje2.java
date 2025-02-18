package BOLETINES.src.boletin3;

import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * Dos número de tipo short, si el primero es mayor resta, si no suma
 * @version 1.0
 * @author Karly Albarrán
 */
public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short numero1, numero2;

        System.out.println("Escribe el primero número: ");
        numero1 = sc.nextShort();

        System.out.println("Escribe el segundo número: ");
        numero2 = sc.nextShort();

        if (numero1 >= numero2){
            System.out.println(numero1 - numero2);
            System.out.println("Resta");

        } else {
            System.out.println(numero1+numero2);
            System.out.println("Suma");
        }


    }
}
