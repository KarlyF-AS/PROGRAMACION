package BOLETINES.src.boletin2; /**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros, dolares, cambio;

        System.out.println("¿Valor del cambio?");
        cambio= sc.nextDouble();

        System.out.println("¿cantidad en euros?");
        euros= sc.nextDouble();

        dolares= euros / cambio;
        System.out.println("Su cambio es de: " + dolares + " dolares");
    }
}