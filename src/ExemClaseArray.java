/*//import java.util.Arrays;

public class ExemClaseArray {
  public static void main(String[] args) {
      int[] numeros = {8, 13, 15, 19, 56, 57, 61};
      int[] numeros2 = {8, 13, 15, 19, 56, 8, 61};

      int indice = Arrays.binarySearch(numeros, 30);
      //Arrays.binarySearch(numeros, 0, numeros.length- otra posibilidad quie tenemos
      if (indice>=0) System.out.println("Existe na taboa");
      else System.out.println("Non existe");
      System.out.println(indice);
      int [] num2 = Arrays.copyOf (numeros, numeros.length);
      int [] num3 = Arrays.copyOfRange (numeros, 1,7);
      for (int n: num3) System.out.println(n);

        System.out.println("numeros e numeros 2 son iguais:" + comparaTaboas(numeros, numeros2));
        System.out.println("numeros e numeros 2 son iguais:" + Arrays.equals (numeros, numeros2));
    }
    public static boolean comparaTaboas (int []a, int [] b, int i){
        if (a.length== b.length);{

            boolean iguais= true;
                for (i = 0; i< a.length; i++) {
                    if (a [i]!= b[i]){
                        return true;
                    }
                }
            }
            return false;
        }
        }
//hacer programa  {5,9,11,31,41} localizar el lugar de insercion, crear una nueva tabla. copiar la primera parte
*/