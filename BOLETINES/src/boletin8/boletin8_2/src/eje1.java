public class eje1 {
    public static void main(String[] args) {
        String cadea = "paco";  // Cadena de entrada para las operaciones

                dosPrimerosCaracteres(cadea);
                dosPrimerosCaracteresManual(cadea);
                System.out.println(" ");  // Separador visual
                dosPrimerosCaracteresArray(cadea);
                tresUltimosCaracteres(cadea);
                cadaDosCaracteres(cadea);
                mostrarinverso(cadea);
            }

            public static void dosPrimerosCaracteres(String cadea){
                System.out.println(cadea.substring(0, 2));  // Subcadena desde índice 0 a 2 (exclusivo)
            }

            public static void dosPrimerosCaracteresManual(String cadea){
                for(int i=0;i<2;i++){
                    System.out.print(cadea.charAt(i));  // Imprime carácter por carácter
                }
            }

            public static void dosPrimerosCaracteresArray(String cadea){
                char[] charArray = cadea.toCharArray();  // Convierte String a array
                for(int i=0;i<2;i++){
                    System.out.print(charArray[i]);  // Acceso directo al array
                }
                System.out.println(" ");  // Salto de línea adicional
            }

            public static void tresUltimosCaracteres(String cadea){
                System.out.println(cadea.substring(cadea.length()-3,cadea.length()));  // Subcadena de los últimos 3
            }

            public static void cadaDosCaracteres(String cadea){
                for(int i=0;i<cadea.length();i=i+2){
                    System.out.print(cadea.charAt(i));  // Step de 2 en el loop
                }
                System.out.println(" ");  // Salto de línea
            }

            public static void mostrarinverso(String cadea){
                System.out.print(cadea);  // Cadena original
                for(int i=cadea.length()-1;i>=0;i--) {
                    System.out.print(cadea.charAt(i));

                }
    }
}