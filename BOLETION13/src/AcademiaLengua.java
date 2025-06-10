package BOLETION13.src;

import java.util.*;

public class AcademiaLengua {

    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();

        // Crear algunos académicos
        Academico a1 = new Academico("Juan Pérez", 2010);
        Academico a2 = new Academico("Ana García", 2015);
        Academico a3 = new Academico("Carlos Ruiz", 2008);
        Academico a4 = new Academico("María López", 2020);
        Academico a5 = new Academico("Pedro Sánchez", 2012);

        // Asignar sillones
        nuevoAcademico(academia, a1, 'A');
        nuevoAcademico(academia, a2, 'B');
        nuevoAcademico(academia, a3, 'C');
        nuevoAcademico(academia, a4, 'D');
        nuevoAcademico(academia, a5, 'E');

        // Listados
        System.out.println("\nACADÉMICOS POR NOMBRE:");
        listarPorNombre(academia);

        System.out.println("\nACADÉMICOS POR AÑO DE INGRESO:");
        listarPorAno(academia);

        System.out.println("\nACADÉMICOS POR SILLÓN:");
        listarPorSillon(academia);
    }

    public static boolean nuevoAcademico(Map<Character, Academico> academia,
                                         Academico nuevo, Character letra) {
        if (!Character.isLetter(letra)) {
            System.out.println("El caracter no es una letra válida");
            return false;
        }

        if (academia.containsKey(letra)) {
            System.out.println("El sillón " + letra + " ya está ocupado");
            return false;
        }

        academia.put(letra, nuevo);
        return true;
    }

    public static void listarPorNombre(Map<Character, Academico> academia) {
        List<Academico> academicos = new ArrayList<>(academia.values());
        Collections.sort(academicos);

        for (Academico a : academicos) {
            System.out.println(a);
        }
    }

    public static void listarPorAno(Map<Character, Academico> academia) {
        List<Academico> academicos = new ArrayList<>(academia.values());
        academicos.sort(Comparator.comparingInt(Academico::getAnoIngreso));

        for (Academico a : academicos) {
            System.out.println(a.getAnoIngreso() + " - " + a.getNombre());
        }
    }

    public static void listarPorSillon(Map<Character, Academico> academia) {
        for (Map.Entry<Character, Academico> entry : academia.entrySet()) {
            System.out.println("Sillón " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

class Academico implements Comparable<Academico> {
    private String nombre;
    private int anoIngreso;

    public Academico(String nombre, int anoIngreso) {
        this.nombre = nombre;
        this.anoIngreso = anoIngreso;
    }

    public String getNombre() { return nombre; }
    public int getAnoIngreso() { return anoIngreso; }

    @Override
    public int compareTo(Academico otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (ingreso: " + anoIngreso + ")";
    }
}