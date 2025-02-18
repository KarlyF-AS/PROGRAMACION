/**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
package boletin2Extra;

import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioT, precioP=0, descuento;
        System.out.println("Precio tarifa: ");
        precioT= sc.nextDouble();
        System.out.println("Precio pagado: ");
        precioP= sc.nextDouble();

        descuento = precioT - precioP / 100 * 100;

        System.out.println("El porcentaje descontado es de: " + descuento + "%");
    }
}
