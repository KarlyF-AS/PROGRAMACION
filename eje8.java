package Boletin8; // Indica que esta clase pertenece al paquete Boletin8

/**
 * Compara se o String “Java” é igual que o String “JavaScript”.
 * (Compara si el texto "Java" es igual al texto "JavaScript")
 * @author Karly Albarrán
 */
public class eje8 {
    public static void main(String[] args) {

        // Declaramos una variable de tipo String con el valor "Java"
        String texto1 = "Java";

        // Declaramos otra variable de tipo String con el valor "JavaScript"
        String texto2 = "JavaScript";

        // Comparamos ambos Strings usando el método .equals()
        // Este método devuelve true si ambos textos son exactamente iguales (mismo contenido y mayúsculas/minúsculas)
        if(texto1.equals(texto2)){
            // Si son iguales, se muestra el mensaje "iguales"
            System.out.println("iguales");
        }else{
            // Si no son iguales, se muestra el mensaje "distintos"
            System.out.println("distintos");
        }//end else
    }//end main
}//end class
