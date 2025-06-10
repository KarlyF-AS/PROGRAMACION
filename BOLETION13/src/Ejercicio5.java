package BOLETION13.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros (-1 para terminar):");

        do {
            numero = sc.nextInt();
            if (numero > 0) {
                numeros.add(numero);
            }
        } while (numero != -1);

        // Mostrar elementos con índice par multiplicados por 100
        System.out.println("\nElementos con índice par multiplicados por 100:");
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(numeros.get(i) * 100);
            }
        }
    }
}