package BOLETINES.src.boletin4;

import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productos;

        System.out.println("Introduce la cantidad de articulo");
        productos = sc.nextInt();

        if (productos <= 100 ){
            System.out.println("Articulo de baja necesidad");
        } else if (productos >100 && productos<= 500 ) {
            System.out.println("Articulo de mediana necesidad");
        } else if (productos > 500 && productos <= 1000) {
            System.out.println("Articulode alta necesidad");
        }else {
            System.out.println("Articulo de primera necesidad");
        }
    }
}
