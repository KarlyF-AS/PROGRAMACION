package Boletin8;

/**
 * Transforma a cadea de texto “ javeros” a maiúsculas.
 * Garda o valor na variable e posteriormente convértea novamente a minúsculas.
 * @author Karly Albarrán
 */
public class eje7 {
    public static void main(String[] args) {

        // Declaramos una variable de tipo String con el texto original
        String textoInicial = " javeros";

        // Convertimos el texto a mayúsculas con .toUpperCase() y lo guardamos en una nueva variable
        String textoMayuscula = textoInicial.toUpperCase();

        // Mostramos el texto convertido a mayúsculas por consola
        System.out.println(textoMayuscula); // Salida: " JAVEROS"

        // Convertimos el texto nuevamente a minúsculas con .toLowerCase() y lo guardamos
        String textoMinuscula = textoMayuscula.toLowerCase();

        // Mostramos el texto en minúsculas
        System.out.println(textoMinuscula); // Salida: " javeros"
    }//end main
}//end class
