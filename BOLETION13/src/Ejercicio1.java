package BOLETION13.src;
import java.util.Arrays;

public class Ejercicio1 {

    // Método genérico para concatenar dos arrays
    public static <T> T[] concatenarArrays(T[] array1, T[] array2) {
        T[] resultado = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);
        return resultado;
    }

    public static void main(String[] args) {
        // Probamos el método con arrays de Integer
        Integer[] numeros1 = {1, 2, 3};
        Integer[] numeros2 = {4, 5, 6};
        Integer[] concatenados = concatenarArrays(numeros1, numeros2);

        System.out.println("Arrays concatenados:");
        for (Integer num : concatenados) {
            System.out.print(num + " ");
        }
    }
}