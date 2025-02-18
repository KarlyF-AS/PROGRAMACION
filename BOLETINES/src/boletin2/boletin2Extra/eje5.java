package boletin2Extra;

import java.util.Scanner;

/**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 * Del boletin extra, los utlimos dos ejercicios, me resualtaron un poco más complicados
 */

public class eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldoF, sueldoB, comision = 0, km = 0, dietas = 0;
        double sueldoL = 0, IRPF, seguridadS;

        System.out.println("Introduce tu sueldo fijo: ");
        sueldoF = sc.nextDouble();

        System.out.println("Introduce el total en comisión: ");
        comision = sc.nextDouble();

        System.out.println("Introduce los km recorridos: ");
        km = sc.nextDouble();

        System.out.println("Introduce la cantidad de días en los que te desplazas: ");
        dietas = sc.nextDouble();


        sueldoB = sueldoF + comision + km * 2 + dietas * 30;
        System.out.println("El total en sueldo bruto es de: " + sueldoB);

        IRPF = sueldoB * 0.18;
        seguridadS = 36;

        sueldoL = sueldoB - IRPF - seguridadS;
        System.out.println("El total en sueldo liquido es de: " + sueldoL);
    }
}

