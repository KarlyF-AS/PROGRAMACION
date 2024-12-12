public class CorreccionExamen2 {
    public static void main (String[]args){
        String [] b = new String [20];
        System.out.println(borraLibro(b, -6));
        for (int i=0; i<b.length; i++)
            System.out.println(introducirlibro(b, "Cosmicas"));
            System.out.println(introducirlibro(b, "O derradeiro"));
        //---------------------------------------------------------------------
        int suma = 0;
        for (int i=1; i<=10; i++){
            if (i% 2 == 0) continue;
            suma+=i;
        }
        System.out.println(suma);
        //----------------------------------------------------------------------
        int [] numeros = {1, 2, 3, 4, 5};
        int [] duplicados = duplicarArray(numeros);
        System.out.println(duplicados[3]);
        //----------------------------------------------------------------------
        /**
         *
         */
        //contador = 0 y x = 10
        //   0           10
        //   1            7
        //   2            4
        //   3            1
        //   4           -2

        int contador = 0;
        int x = 10;
        while (x>0) {
            x -= 3;
            contador++;
        }
        System.out.println(contador);
        String [] frutas = {"mazá", "laranxa", "platano"};
        String [] copiaFrutas = new String [frutas.length];
        for (int i= frutas.length-1; i>0; i--)
            copiaFrutas[i] = frutas [i];
//-----------------------------------------------------------------------------------------
    }
    public static int [] duplicarArray (int [] orixinal){
        int[] copiaDuplicada = new int [orixinal.length];
        for (int i=0; i<orixinal.length; i++)
            copiaDuplicada[i] = orixinal[i]*2;
        return copiaDuplicada;
    }
    public static void mostrarLibros (String[] biblioteca){

        for (String libro : biblioteca){
            if (libro != null) System.out.println(libro);
            else System.out.println("Baleiro");
        }
    }
    public static boolean introducirlibro (String [] biblioteca, String titulo){
        boolean chea= true;
        for (int i = 0; i<biblioteca.length; i++){
            if (biblioteca [i]==null){
                biblioteca[i] = titulo;
                chea = false;
                break;
            }
        }
        return !chea;
    }
    public static boolean borraLibro (String[] biblioteca, int indice) {
        if (indice >=0 && indice<biblioteca.length && biblioteca[indice] != null){
            biblioteca[indice] = null;
            return true;
        }
        else return false;
    }
}

