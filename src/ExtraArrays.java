import java.util.Scanner;

public class ExtraArrays {
    public static class EjerArrays2 {
        public static void main(String[] args) {
            // Definir el array con los valores dados
            int[] tabla =  {1, 3, 9, 16, 21, 32, 41, 93, 106};

            // Calcular la mitad del tamaño del array
            int mitad = tabla.length / 2;

            // Crear un scanner para pedir al usuario un número
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un número para buscar en el array:");
            int numeroBuscado = scanner.nextInt();

            // Buscar el número en el array y proporcionar la información
            boolean encontrado = false;
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] == numeroBuscado) {
                    encontrado = true;

                    // Informar sobre si el número es mayor o menor que la mitad
                    if (numeroBuscado > tabla[mitad]) {
                        System.out.println(numeroBuscado + " es mayor que la mitad del array.");
                    } else if (numeroBuscado < tabla[mitad]) {
                        System.out.println(numeroBuscado + " es menor que la mitad del array.");
                    } else {
                        System.out.println(numeroBuscado + " es igual a la mitad del array.");
                    }

                    // Mostrar en qué posición se encuentra
                    System.out.println("El número " + numeroBuscado + " está en la posición: " + i);

                    // Indicar si está a la izquierda o a la derecha de la mitad
                    if (i < mitad) {
                        System.out.println("El número está a la izquierda de la mitad.");
                    } else if (i > mitad) {
                        System.out.println("El número está a la derecha de la mitad.");
                    }

                    break; // Salir del bucle si se encuentra el número
                }
            }

            if (!encontrado) {
                System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
            }

            scanner.close();
        }
    }
}
