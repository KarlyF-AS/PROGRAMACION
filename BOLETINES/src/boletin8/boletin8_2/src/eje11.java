public class eje11 {
    public static void main(String[] args) {
        String nombre = "paco gutUerrez";
        System.out.println(formatearNombre(nombre));  // Output: "PacoGutuerrez"
    }
    public static String formatearNombre(String nombre) {
        String nombreFormateado = "";
        nombre = nombre.toLowerCase();  // Normaliza todo a minúsculas

        char[] arrayNombre = nombre.toCharArray();  // Convierte el String en array de caracteres

        for (int i = 0; i < arrayNombre.length; i++) {
            // Capitaliza si es el primer carácter o si el anterior es un espacio
            if (i == 0 || arrayNombre[i - 1] == ' ') {
                arrayNombre[i] = Character.toUpperCase(arrayNombre[i]);
            }
            nombreFormateado += arrayNombre[i];  // Construye el resultado carácter por carácter
        }

        nombreFormateado = nombreFormateado.replace(" ", "");  // Elimina todos los espacios
        return nombreFormateado;
    }
}
