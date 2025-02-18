package BOLETINES.src.boletin3;

import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Escribe el número: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("+");

        } else if (numero == 0) {
            System.out.println("El número es cero");

        } else System.out.println("-");

        }
    }


