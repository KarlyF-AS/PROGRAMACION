package BOLETINES.src.boletin2; /**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        double numero1, numero2, suma, resta, producto, cociente;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el primer número: ");
        numero1= sc.nextDouble();

        System.out.println("Escriba el segundo número:");
        numero2= sc.nextDouble();

        suma= numero1 + numero2;
        System.out.println("La suma de ambos números es de:" +suma);

        resta= numero1 - numero2;
        System.out.println("La resta de ambos números es de:" +resta);

        producto= numero1 * numero2;
        System.out.println("El producto de ambos números es de:" +producto);

        cociente= numero1 / numero2;
        System.out.println("El cociente de ambos números es de:" +cociente);
    }
}
