public class eje12 {
    public static void main(String[] args) {
        String cadea = "Hola, Buenos dias";
        analizador(cadea);
    }
    public static void analizador(String cadea) {
        // Pasar a array
        String[] palabras = cadea.split(" ");
        // Contar palabras
        System.out.println("Numero de palabras: " + palabras.length);
        // Contar letras y determinar la palabra más larga
        int contadorLetras = 0;
        String palabraMasLarga = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) != ' ') {
                contadorLetras++;
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        System.out.println("Numero de letras: " + contadorLetras);
        System.out.println("Palabra mas larga: " + palabraMasLarga);
    }
}
