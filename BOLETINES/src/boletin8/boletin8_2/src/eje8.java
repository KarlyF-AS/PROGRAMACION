public class eje8 {
    public static void main(String[] args) {
        String binario = "1010";
        System.out.println(binarioADecimal(binario)); // Output: 10
    }
    public static int binarioADecimal(String binario) {
        // Validación de entrada
        if (binario == null || binario.isEmpty()) {
            return -1;
        }

        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char c = binario.charAt(i);

            // Verificar carácter válido
            if (c != '0' && c != '1') {
                return -1;
            }

            // Calcular valor decimal del bit actual
            if (c == '1') {
                try {
                    decimal += Math.pow(2, longitud - 1 - i);
                } catch (ArithmeticException e) {
                    return -1; // Overflow detectado
                }
            }
        }
        return decimal;
    }
}
