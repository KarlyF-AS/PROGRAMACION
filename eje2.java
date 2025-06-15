package Boletin8;

/**
 * Desmenuza o String “Java” mostrándoo por pantalla carácter a carácter.
 * (Descompone el texto "Java" y lo muestra carácter por carácter)
 * @author Karly Albarrán
 */
public class eje2 {

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Declaramos una cadena con el texto "java"
        String java = "java";

        // Usamos split("") para dividir la cadena en un array de caracteres como Strings individuales
        // Cada carácter queda separado en una posición del array
        String[] tabla = java.split("");

        // Recorremos el array con un for-each
        // En cada vuelta, tab es un carácter (String de longitud 1)
        for(String tab : tabla){
            // Imprime el carácter actual en una línea nueva
            System.out.println(tab);
        }

    }
}
