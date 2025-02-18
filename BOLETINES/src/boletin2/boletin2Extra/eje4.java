package boletin2Extra;
/**
 * Calcula y descompone el total entre billetes de 100, 20 y 5 y monedas de 1€
 * @version 1.0
 * @author Karly Albarrán
 */
import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, restoT, b100=0, b20=0, b5=0, m1=0;

        System.out.println("Cantidad de dinero a descomponer: ");
        cantidad = sc.nextInt();

        b100 = cantidad / 100;
        restoT = cantidad % 100;

        b20 = restoT / 20;
        restoT = cantidad %= 20;

        b5 = restoT / 5;
        m1 = restoT % 5;

        System.out.println("Tienes "+ b100 + " billetes de 100€");
        System.out.println("Tienes "+ b20 + " billetes de 20€");
        System.out.println("Tienes "+ b5 + " billetes de 5€");
        System.out.println("Tienes "+ m1 + " monedas de 1€");
    }
}