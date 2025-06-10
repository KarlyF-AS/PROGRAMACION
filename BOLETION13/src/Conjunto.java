package BOLETION13.src;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

    // Unión de dos conjuntos
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    // Intersección de dos conjuntos
    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> conjuntoA = new HashSet<>();
        conjuntoA.add(1); conjuntoA.add(2); conjuntoA.add(3);

        Set<Integer> conjuntoB = new HashSet<>();
        conjuntoB.add(2); conjuntoB.add(3); conjuntoB.add(4);

        System.out.println("Unión: " + union(conjuntoA, conjuntoB));
        System.out.println("Intersección: " + interseccion(conjuntoA, conjuntoB));
    }
}