public class eje5 {
    public static void main(String[] args) {
        String text = "republica de Argentina";
        System.out.println(iniciales(text));    // Output: "rda"
        System.out.println(mayusculas(text));   // Output: "Republica De Argentina"
        System.out.println(letrasA(text));      // Output: "Argentina " (con espacio final)
    }

    public static String iniciales(String text) {
        String iniciales = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            iniciales += palabras[i].charAt(0);  // Fallará si hay palabras vacías
        }
        return iniciales;
    }

    public static String mayusculas(String text) {
        String mayusculas = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            char inicial = Character.toUpperCase(palabras[i].charAt(0));
            String resto = palabras[i].substring(1);  // Funciona incluso si length=1 (substring(1,1) = "")
            mayusculas += inicial + resto;
            mayusculas += (i != palabras.length - 1) ? " " : "";  // Evita espacio final
        }
        return mayusculas;
    }

    public static String letrasA(String text) {
        String letrasA = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            char primeraLetra = palabras[i].charAt(0);
            if (primeraLetra == 'a' || primeraLetra == 'A') {
                letrasA += palabras[i] + " ";  // Espacio añadido siempre, incluso al final
            }
        }
        return letrasA;
    }
}
