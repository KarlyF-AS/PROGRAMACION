package BOLETION13.src;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Insertar 100 números aleatorios entre 1 y 10
        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(10) + 1);
        }

        System.out.println("Colección antes de eliminar:");
        System.out.println(numeros);

        // Eliminar todos los 5 y 7
        numeros.removeIf(n -> n == 5 || n == 7);

        System.out.println("\nColección después de eliminar 5 y 7:");
        System.out.println(numeros);
    }
}