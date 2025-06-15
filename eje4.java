package Boletin8;
/**
 * Elimina los espacios de texto: “James Gosling Created Java”
 * @author Karly Albarrán
 */
public class eje4 {
    public static void main(String[] args) {
        // Aquí se intenta imprimir el texto sin espacios usando '\b'
        // Pero '\b' es un carácter de retroceso que no elimina espacios en este contexto
        // Por eso esta línea no elimina los espacios como se esperaba
        System.out.println("James \bGosling \bCreated \bJava");

        // Forma correcta para eliminar espacios en Java:
        // String texto = "James Gosling Created Java";
        // System.out.println(texto.replace(" ", ""));
    }//end main
}//end class
