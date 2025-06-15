package Boletin8; // Indica que esta clase pertenece al paquete Boletin8

/**
 * Tenta escribir un método que, dado un obxecto da clase String,
 * conte diferentes tipos de caracteres.
 * O método imprime o número de letras, díxitos e espazos da cadea.
 * Exemplo de texto: «Ola, son alumno de DAM1, e son programador desde o 2024».
 * @author Karly Albarrán
 */
public class eje11 {
    public static void main(String[] args) {

        int contadorEspacios = 0; // Contador para contar los espacios en blanco

        // Se declara el texto que se va a analizar
        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";

        // Se eliminan los espacios en blanco
        String texto2 = texto.replace(" ", "");

        // Luego se eliminan las comas (caracteres especiales)
        String texto3 = texto2.replace(",", "");

        // Se muestra la longitud del texto resultante (sin espacios ni comas), que representa las letras
        System.out.println("Muestra el número de letras sin contar espacios ni caracteres especiales: " + texto3.length());

        // Se imprime la longitud total del texto original (incluye letras, espacios, dígitos y comas)
        System.out.println("El texto tiene un total de " + texto.length() + " dígitos");

        // Se recorre el texto carácter por carácter para contar los espacios en blanco
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                // Si el carácter actual es un espacio, se incrementa el contador
                contadorEspacios++;
            }
        }
    }
}