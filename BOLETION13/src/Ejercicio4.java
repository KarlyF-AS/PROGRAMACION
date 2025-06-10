package BOLETION13.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Double> positivos = new ArrayList<>();
        ArrayList<Double> negativos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Introduce números reales (0 para terminar):");

        do {
            numero = sc.nextDouble();
            if (numero > 0) {
                positivos.add(numero);
            } else if (numero < 0) {
                negativos.add(numero);
            }
        } while (numero != 0);

        // Mostrar colecciones y sumas
        mostrarColecciones(positivos, negativos);

        // Eliminar elementos >10 y <-10
        positivos.removeIf(n -> n > 10);
        negativos.removeIf(n -> n < -10);

        System.out.println("\nDespués de eliminar:");
        mostrarColecciones(positivos, negativos);
    }

    private static void mostrarColecciones(ArrayList<Double> pos, ArrayList<Double> neg) {
        System.out.println("\nPositivos: " + pos);
        System.out.println("Suma positivos: " + sumarLista(pos));
        System.out.println("Negativos: " + neg);
        System.out.println("Suma negativos: " + sumarLista(neg));
    }

    private static double sumarLista(ArrayList<Double> lista) {
        double suma = 0;
        for (double num : lista) {
            suma += num;
        }
        return suma;
    }
}