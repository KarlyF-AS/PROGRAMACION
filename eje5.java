package Boletin8;

/**
 * Conta as vocais e as consoantes do String “java java java”. OLLO COS ESPAZOS!
 * (Cuenta las vocales y consonantes del texto, cuidando los espacios)
 * @author Karly Albarrán
 */
public class eje5 {

    // Método principal, punto de entrada del programa
    public static void main(String[] args) {

        // Se declara una cadena con el texto "java java java"
        String texto = "java java java";

        // Se eliminan todos los espacios de la cadena usando replace()
        // Esto es para contar solo los caracteres útiles (letras)
        String textoSinEspacios = texto.replace(" ", "");

        // Se obtiene la longitud del texto sin espacios
        int numeroDeCaracteres = textoSinEspacios.length();

        // Se muestra por consola la cantidad de caracteres (sin contar espacios)
        System.out.println("Número de caracteres (sin contar espacios): " + numeroDeCaracteres);
    }
}
