package Boletin8;
/**
 * Invierte el texto: “Java dende 0”
 * (Da la vuelta a la cadena de texto)
 * @author Karly Albarrán
 */
public class eje3 {
    public static void main(String[] args) {
        // Definimos el texto original que queremos invertir
        String texto = "java desde 0";

        // Variable donde construiremos el texto invertido, inicialmente vacía
        String invertida = "";

        // Recorremos el texto original desde el último carácter hasta el primero
        // texto.length() - 1 es el índice del último carácter
        // indice>=0 asegura que lleguemos al primer carácter
        // indice-- decrementa el índice en cada iteración
        for (int indice = texto.length() - 1; indice >= 0; indice--) {

            // Agregamos (concatenamos) cada carácter al string invertida
            invertida += texto.charAt(indice);
        } // fin del for

        // Imprimimos el texto invertido en consola
        System.out.println("Cadena invertida: " + invertida);

    } // fin del main
} // fin de la clase
