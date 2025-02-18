package BOLETINES.src.boletin2; /**
 * Calcula el total de billetes y monedas
 * @version 1.0
 * @author Karly Albarrán
 */
import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros, metro = 1.852, millaM;

        System.out.println("Escribe la cantidad de Millas a convertir: ");
        millaM = sc.nextDouble();

        metros = millaM * metro;

        System.out.println("La conversión sería de: " + metros);
    }
}
