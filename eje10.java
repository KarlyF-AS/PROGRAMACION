package Boletin8; // Define el paquete donde se encuentra esta clase

/**
 * Transforma os caracteres do String: “ABCD” a ASCII.
 * (Convierte los caracteres del String "ABCD" a sus valores ASCII)
 * @author Karly Albarrán
 */
public class eje10 {
    public static void main(String[] args) {

        // Se declara una variable tipo String con el texto "ABCD"
        String texto = "ABCD";

        // Se recorre cada carácter del String usando un bucle for
        for (int i = 0; i < texto.length(); i++) {

            // charAt(i) devuelve el carácter en la posición 'i' del texto
            // Al asignarlo a un entero, se obtiene su código ASCII automáticamente
            int asciiValue = texto.charAt(i);

            // Se imprime el carácter y su valor ASCII correspondiente
            System.out.println("El valor ASCII de '" + texto.charAt(i) + "' es " + asciiValue);
        }//end for

    }//end main
}//end class
