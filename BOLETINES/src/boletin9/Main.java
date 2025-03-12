package boletin9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Libro_eje1 libro1 = new Libro_eje1();

        libro1.amorsar(); // mostrar el contructor por defecto
        System.out.println("..................................");

        libro1.setTitulo("El Código Da Vinci");
        System.out.println(libro1.getTitulo());
        libro1.setAutor("Dan Brown");
        System.out.println(libro1.getAutor());
        libro1.setAno(2004);
        System.out.println(libro1.getAno());
        libro1.setNumPaginas((short) 616);
        System.out.println(libro1.getNumPaginas());
        libro1.setValoracion(4.1F);
        System.out.println(libro1.getValoracion());

        System.out.println("..................................");
        libro1.amorsar();

        System.out.println("..................................");
        Libro_eje1 libro2 = new Libro_eje1("Orgullo y Prejuicio", " Jane Austen", 1813, (short) 432,4.3f);
        libro2.amorsar();
        System.out.println("..................................");

        Consumo c1 = new Consumo();
        c1.setLitros(50);
        c1.setPGas(1.57);

        Consumo c2 = new Consumo(300, 40, 90, 1.50);
        System.out.println("El consumo medio del c2 es de:" + c2.);
    }
}