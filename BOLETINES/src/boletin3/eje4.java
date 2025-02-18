package BOLETINES.src.boletin3;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso1 = 0, peso2 = 0, diferencia;
        String nome1, nome2;

        System.out.println("Escribe tu nombre persona 1: ");
        nome1 = sc.nextLine();
        System.out.println("Escribe tu peso " + nome1 + ":");
        peso1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Escribe tu nombre persona 2: ");
        nome2 = sc.nextLine();
        System.out.println("Escribe tu peso " + nome2 + ":");
        peso2 = sc.nextInt();

        if (peso1 > peso2) {
            diferencia = peso1 - peso2;
            System.out.println(nome1 + " pesa más que " + nome2);
        } else if (peso1 < peso2) {
            diferencia = peso2 - peso1;
            System.out.println(nome2 + " pesa más que " + nome1);
        } else {
            diferencia = 0;
            System.out.println("Ambas personas pesan lo mismo.");
        }

        System.out.println("Diferencia de peso: " + diferencia + " kg");

        }
    }

