package BOLETION13.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); lista.add(2); lista.add(3); lista.add(2);
        lista.add(4); lista.add(3); lista.add(5); lista.add(1);

        Set<Integer> sinRepetir = new HashSet<>(lista);
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> unicos = new HashSet<>();

        // Encontrar repetidos y únicos
        for (Integer num : lista) {
            if (lista.indexOf(num) != lista.lastIndexOf(num)) {
                repetidos.add(num);
            } else {
                unicos.add(num);
            }
        }

        System.out.println("Lista original: " + lista);
        System.out.println("Sin repetir: " + sinRepetir);
        System.out.println("Repetidos: " + repetidos);
        System.out.println("Únicos: " + unicos);
    }
}