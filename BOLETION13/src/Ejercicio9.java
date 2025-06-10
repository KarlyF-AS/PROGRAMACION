package BOLETION13.src;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    private static ArrayList<RegistroTemperatura> registros = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ ESTACIÓN METEOROLÓGICA");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: nuevoRegistro(); break;
                case 2: listarRegistros(); break;
                case 3: mostrarEstadisticas(); break;
                case 4: guardarDatos(); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

    private static void nuevoRegistro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce temperatura en °C: ");
        double temp = sc.nextDouble();

        RegistroTemperatura reg = new RegistroTemperatura(temp, LocalDateTime.now());
        registros.add(reg);
        System.out.println("Registro añadido: " + reg);
    }

    private static void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros");
            return;
        }

        System.out.println("\nREGISTROS DE TEMPERATURA:");
        for (RegistroTemperatura reg : registros) {
            System.out.println(reg);
        }
    }

    private static void mostrarEstadisticas() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros");
            return;
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double suma = 0;

        for (RegistroTemperatura reg : registros) {
            double temp = reg.getTemperatura();
            if (temp > max) max = temp;
            if (temp < min) min = temp;
            suma += temp;
        }

        double promedio = suma / registros.size();

        System.out.println("\nESTADÍSTICAS:");
        System.out.println("Máxima: " + max + "°C");
        System.out.println("Mínima: " + min + "°C");
        System.out.println("Promedio: " + promedio + "°C");
    }

    private static void cargarDatos() {
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String archivo = "rexistros" + fecha + ".dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            registros = (ArrayList<RegistroTemperatura>) ois.readObject();
            System.out.println("Datos cargados del archivo " + archivo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró archivo de datos previo");
        } catch (Exception e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    private static void guardarDatos() {
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String archivo = "rexistros" + fecha + ".dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(registros);
            System.out.println("Datos guardados en " + archivo);
        } catch (Exception e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }
}

class RegistroTemperatura implements Serializable {
    private double temperatura;
    private LocalDateTime fechaHora;

    public RegistroTemperatura(double temperatura, LocalDateTime fechaHora) {
        this.temperatura = temperatura;
        this.fechaHora = fechaHora;
    }

    public double getTemperatura() { return temperatura; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                " - " + temperatura + "°C";
    }
}