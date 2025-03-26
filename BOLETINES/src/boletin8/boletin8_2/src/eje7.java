public class eje7 {
    public static void main(String[] args) {
        String text1 = "casos";
        String text2 = "caso";
        System.out.println(estaContido(text1, text2));    // true ("caso" está en "casos")
        System.out.println(ordenAlfabetico(text1, text2)); // Error potencial: StringIndexOutOfBoundsException
    }

    public static boolean estaContido(String text1, String text2) {
        return text1.contains(text2) || text2.contains(text1);  // Simple pero funcional para casos básicos
    }

    public static String ordenAlfabetico(String text1, String text2) {
        for (int i = 0; i < text1.length(); i++) {  // Peligro: no considera largo de text2
            // Error: Si i >= text2.length(), charAt(i) falla
            if (text1.charAt(i) < text2.charAt(i)) {
                return text1;
            } else if (text1.charAt(i) > text2.charAt(i)) {
                return text2;
            } else {
                // Lógica de longitud prematura (debería aplicarse solo tras comparar todos los caracteres)
                if (text1.length() > text2.length()) return text2;
                else if (text1.length() < text2.length()) return text1;
            }
        }
        return "iguales";  // Solo si son idénticas en largo y caracteres
    }
}
