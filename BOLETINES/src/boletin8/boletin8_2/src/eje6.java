public class eje6 {
    public static void main(String[] args) {
        String cadea = "algoritmo";
        System.out.println(consonantes(cadea));    // Output: "lgrthm"
        System.out.println(vocales(cadea));        // Output: "aioo"
        System.out.println(siguienteVocal(cadea)); // Output: "elguritmu"
        System.out.println(palindromo("hola"));    // Output: false
    }
    public static String consonantes(String cadea) {
        String consonantes = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            // Filtra solo caracteres NO vocales (sistema simple)
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                consonantes += c;
            }
        }
        return consonantes;
    }

    public static String vocales(String cadea) {
        String vocales = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales += c;
            }
        }
        return vocales;
    }
    public static String siguienteVocal(String cadea) {
        String siguienteVocal = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            switch (c) {  // Solo aplica a vocales minúsculas
                case 'a': siguienteVocal += 'e'; break;
                case 'e': siguienteVocal += 'i'; break;
                case 'i': siguienteVocal += 'o'; break;
                case 'o': siguienteVocal += 'u'; break;
                case 'u': siguienteVocal += 'a'; break;
                default:  siguienteVocal += c;   // Conserva otros caracteres
            }
        }
        return siguienteVocal;
    }

    public static boolean palindromo(String cadea) {
        // Normalización básica
        String minus = cadea.toLowerCase();
        String limpia = minus.replaceAll(" ", "");  // Elimina solo espacios

        // Reemplazo de vocales acentuadas (cobertura limitada)
        String limpia2 = "";
        for (int i = 0; i < limpia.length(); i++) {
            char c = limpia.charAt(i);
            switch (c) {
                case 'á': c = 'a'; break;
                case 'é': c = 'e'; break;
                case 'í': c = 'i'; break;
                case 'ó': c = 'o'; break;
                case 'ú': c = 'u'; break;
            }
            limpia2 += c;
        }

        // Creación de versión inversa
        String inversa = new StringBuilder(limpia2).reverse().toString();

        return limpia2.equals(inversa);  // Comparación final
    }
}
