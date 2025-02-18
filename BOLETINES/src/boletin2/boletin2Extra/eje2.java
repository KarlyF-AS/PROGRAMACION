/**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
package boletin2Extra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF, gradosK;
        System.out.println("Ingrese la temperatura C° a convertir");
        gradosC= sc.nextDouble();

        gradosF = (gradosC*9/5) +32;
        gradosK = gradosC + 273.15;
        System.out.println("La temperatura en Grados Fahrenheit es: " + gradosF + "°F");
        System.out.println("La temperatura en Grados Kelvin es: " + gradosK + "K");
        }
    }