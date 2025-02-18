/**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
package boletin2Extra;

import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b100, b20, b5;
        int monedas, total;

        System.out.println("Ingrese la cantidad de monedas de 1 euro:");
        monedas =sc.nextInt();
        System.out.println("Ingrese la cantidad de billetes de 100:");
        b100 = sc.nextInt();
        System.out.println("Ingrese la cantidad de billetes de 20:");
        b20= sc.nextInt();
        System.out.println("Ingrese la cantidad de billetes de 5");
        b5 = sc.nextInt();

        total= b100*100 + b20*20 + b5*5 + monedas;
        System.out.println("El total es de : " +total + "€");
    }
}