package BOLETION13.src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Insertar 100 números aleatorios
        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(10) + 1);
        }

        System.out.println("Colección antes de eliminar:");
        System.out.println(numeros);

        // Eliminar con Iterator
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num == 5 || num == 7) {
                it.remove();
            }
        }

        System.out.println("\nColección después de eliminar con Iterator:");
        System.out.println(numeros);
    }
}