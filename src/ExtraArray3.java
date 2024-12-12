import java.util.ArrayList;
import java.util.HashSet;

public class ExtraArray3 {

    public static void main(String[] args) {
        int[] arrayOriginal = {5, 9, 5, 7, 3, 9, 5};

        // Encuentra los repetidos
        ArrayList<Integer> repetidos = obtenerRepetidos(arrayOriginal);
        System.out.println("Números repetidos: " + repetidos);

        // Crea un array nuevo sin repeticiones
        int[] arraySinRepetidos = crearArraySinRepeticiones(arrayOriginal, repetidos);
        System.out.print("Array sin los repetidos: ");
        for (int num : arraySinRepetidos) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> obtenerRepetidos(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> repetidos = new ArrayList<>();

        for (int num : array) {
            if (set.contains(num) && !repetidos.contains(num)) {
                repetidos.add(num); // Si ya está en el set y no en repetidos, agrégalo
            } else {
                set.add(num);
            }
        }
        return repetidos;
    }

    public static int[] crearArraySinRepeticiones(int[] array, ArrayList<Integer> repetidos) {
        ArrayList<Integer> listaSinRepetidos = new ArrayList<>();

        for (int num : array) {
            if (!repetidos.contains(num)) {
                listaSinRepetidos.add(num);
            }
        }

        // Convierte la lista a un array
        int[] resultado = new int[listaSinRepetidos.size()];
        for (int i = 0; i < listaSinRepetidos.size(); i++) {
            resultado[i] = listaSinRepetidos.get(i);
        }
        return resultado;
    }
}
