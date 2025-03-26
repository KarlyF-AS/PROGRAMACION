public class eje3 {
    public static void main(String[] args) {

    String cadea = "Galicia esta en españa y estamos en 2025";
    int numero = 3;  // Número máximo de operaciones a realizar en cada método

        System.out.println(comas(cadea, numero));      // Añade comas (hasta 3 veces)
        System.out.println(espacios(cadea, numero));   // Reemplaza espacios (hasta 3)
        System.out.println(numeros(cadea, numero));    // Sustituye dígitos (hasta 3)
        System.out.println(puntos(cadea, numero));     // Inserta puntos (hasta 3 grupos)
}

public static String comas(String cadea, int numero) {
    String cadeaNueva = "";
    int contador = 0;
    boolean valid = true;
    for (int i = 0; i < cadea.length(); i++) {
        cadeaNueva += cadea.charAt(i);
        if (Character.isLetter(cadea.charAt(i)) && valid) {
            if (i != cadea.length() - 1) {
                cadeaNueva += ",";
                contador++;
                if (contador == numero) valid = false;  // Deja de añadir al alcanzar 'numero'
            }
        }
    }
    return cadeaNueva;
    // Nota: Añade comas incluso si hay caracteres no letra después (ej: "a1" → "a,1")
}

public static String espacios(String cadea, int numero) {
    String cadeaNueva = "";
    int contador = 0;
    boolean valid = true;
    for (int i = 0; i < cadea.length(); i++) {
        if (Character.isWhitespace(cadea.charAt(i)) && valid) {
            cadeaNueva += "\\_";  // Posible error: Se usa "\\_" en lugar de "_"
            contador++;
            if (contador == numero) valid = false;
        } else {
            cadeaNueva += cadea.charAt(i);
        }
    }
    return cadeaNueva;
}

public static String numeros(String cadea, int numero) {
    String cadeaNueva = "";
    int contador = 0;
    boolean valid = true;
    for (int i = 0; i < cadea.length(); i++) {
        if (Character.isDigit(cadea.charAt(i)) && valid) {
            cadeaNueva += "X";
            contador++;
            if (contador == numero) valid = false;
        } else {
            cadeaNueva += cadea.charAt(i);
        }
    }
    return cadeaNueva;
}

public static String puntos(String cadea, int numero) {
    String cadeaNueva = "";
    int contador = 0, contadorPuntos = 0;
    boolean valid = true;
    for (int i = 0; i < cadea.length(); i++) {
        cadeaNueva += cadea.charAt(i);
        contador++;
        if (contador == 3 && valid) {
            cadeaNueva += ".";
            contador = 0;
            contadorPuntos++;
            if (contadorPuntos == numero) valid = false;  // Deja de insertar puntos
        }
    }
    return cadeaNueva;
}
}