package Boletin8;

/**
 * Divide a cadea de texto
 * “www.javadende0.com” en dúas partes:
 * “www.java” e “dende0.com”.
 * Logo concaténaas e móstraas de novo.
 * @author Karly Albarrán
 */
public class eje6 {
    public static void main(String[] args) {

        // Texto original a dividir
        String texto = "www.javadende0.com";

        // Separamos las partes según el índice
        // "www.java" son los primeros 9 caracteres
        String parte1 = texto.substring(0, 9); // www.java

        // "dende0.com" empieza en el índice 9
        String parte2 = texto.substring(9);    // dende0.com

        // Mostramos las dos partes por separado
        System.out.println(parte1);
        System.out.println(parte2);

        // Ahora las unimos otra vez en una sola cadena
        String concatenado = parte1 + parte2;

        // Mostramos el resultado final concatenado
        System.out.println("Concatenado: " + concatenado);
    }
}
