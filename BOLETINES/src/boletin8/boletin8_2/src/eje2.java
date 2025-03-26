public class eje2 {
    public static void main(String[] args) {
    String cadea = "Galicia esta en españa y estamos en 2025";

    String conComas = comas(cadea);      // Paso 1: Añadir comas tras letras
        System.out.println(conComas);

    String sinEspacios = espacios(conComas);  // Paso 2: Espacios → "\_"
        System.out.println(sinEspacios);

    String sinNumeros = numeros(sinEspacios); // Paso 3: Dígitos → "X"
        System.out.println(sinNumeros);

    String conPuntos = puntos(sinNumeros);    // Paso 4: Agrupar cada 3 caracteres con puntos
        System.out.println(conPuntos);
}

public static String comas(String cadea) {
    String cadeaNueva = "";
    for (int i = 0; i < cadea.length(); i++) {
        cadeaNueva += cadea.charAt(i);
        // Inserta coma solo si es letra y no es el último carácter
        if (Character.isLetter(cadea.charAt(i)) && i != cadea.length() - 1) {
            cadeaNueva += ",";
        }
    }
    return cadeaNueva;
    // Posible issue: Comas múltiples entre caracteres no letra (ej: "a1b" → "a,1,b,")
}

public static String espacios(String cadea) {
    return cadea.replace(" ", "\\_");  // Resultado muestra "\_" por cada espacio
    // Ejemplo: " " → "\\_" (se imprime como "\_")
}

public static String numeros(String cadea) {
    String cadeaNueva = "";
    for (int i = 0; i < cadea.length(); i++) {
        cadeaNueva += Character.isDigit(cadea.charAt(i)) ? "X" : cadea.charAt(i);
    }
    return cadeaNueva;
}
public static String puntos(String cadea) {
    String cadeaNueva = "";
    int contador = 0;
    for (int i = 0; i < cadea.length(); i++) {
        cadeaNueva += cadea.charAt(i);
        contador++;
        // Añade punto cada 3 caracteres, incluso al final
        if (contador == 3) {
            cadeaNueva += ".";
            contador = 0;
        }
    }
    return cadeaNueva;
    // Ejemplo: "abcdef" → "abc.def."
}
}