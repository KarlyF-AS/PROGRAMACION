public class ExtraArray2 {

    public static void main(String[] args) {
        // Definir el array original
        int[] tablaOriginal =  {1, 3, 9, 16, 21, 32, 41, 93, 106};

        // Llamamos a la función para obtener la "mitad" o una tabla reducida
        int[] tablaReducida = obtenerMitad(tablaOriginal);

        // Mostrar la tabla reducida
        System.out.println("La tabla reducida es:");
        for (int num : tablaReducida) {
            System.out.println(num);
        }
    }

    // Función que recibe un array y devuelve una tabla reducida (mitad del array)
    public static int[] obtenerMitad(int[] tablaOriginal) {
        // Calcular la mitad del tamaño del array
        int mitad = tablaOriginal.length / 2;

        // Crear un nuevo array con la mitad de los elementos
        int[] tablaReducida = new int[mitad];

        // Copiar los elementos de la primera mitad del array original al nuevo array
        for (int i = 0; i < mitad; i++) {
            tablaReducida[i] = tablaOriginal[i];
        }

        return tablaReducida; // Devolver el nuevo array reducido
    }
}

