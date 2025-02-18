package BOLETINES.src.boletin3;

import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Escribe tres número distintos: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1+ "Es mayor");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2+ "Es mayor");
        }else {
            System.out.println(n3+" Es mayor");
        }
    }
}
