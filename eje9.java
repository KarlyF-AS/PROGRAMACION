package Boletin8; // Define el paquete al que pertenece esta clase

/**
 * Sobre a cadea de texto “ Jeve jeve jeve”, substitúe todas as vocais e pola vogal a
 * dando como resultado “Java java java”.
 * (Reemplaza todas las vocales 'e' por 'a')
 * @author Karly Albarrán
 */
public class eje9 {
    public static void main(String[] args) {

        // Declaramos una variable con el texto original, que contiene varias letras 'e'
        String texto = " Jeve Jeve Jeve";

        // Usamos el método replace() para sustituir todas las letras 'e' por 'a'
        // Importante: replace diferencia entre mayúsculas y minúsculas
        String changeTexto = texto.replace("e", "a");

        // Imprimimos el resultado por consola, donde se han reemplazado las 'e' por 'a'
        System.out.println(changeTexto); // Salida: " Java Java Java"
    }//end main
}//end class
