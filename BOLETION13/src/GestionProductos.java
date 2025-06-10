package BOLETION13.src;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionProductos {
    private static Map<String, Integer> productos = new HashMap<>();
    private static final String ARCHIVO = "productos.dat";

    public static void main(String[] args) {
        cargarProductos();
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGESTIÓN DE PRODUCTOS");
            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Visualizar productos");
            System.out.println("5. Salir");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: altaProducto(sc); break;
                case 2: bajaProducto(sc); break;
                case 3: actualizarCantidad(sc); break;
                case 4: visualizarProductos(); break;
                case 5: guardarProductos(); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    private static void altaProducto(Scanner sc) {
        System.out.print("Código del producto: ");
        String codigo = sc.nextLine();

        if (productos.containsKey(codigo)) {
            System.out.println("El producto ya existe");
            return;
        }

        System.out.print("Cantidad inicial: ");
        int cantidad = sc.nextInt();

        productos.put(codigo, cantidad);
        System.out.println("Producto añadido");
    }

    private static void bajaProducto(Scanner sc) {
        System.out.print("Código del producto a eliminar: ");
        String codigo = sc.nextLine();

        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado");
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    private static void actualizarCantidad(Scanner sc) {
        System.out.print("Código del producto: ");
        String codigo = sc.nextLine();

        if (!productos.containsKey(codigo)) {
            System.out.println("Producto no encontrado");
            return;
        }

        System.out.print("Nueva cantidad: ");
        int cantidad = sc.nextInt();

        productos.put(codigo, cantidad);
        System.out.println("Cantidad actualizada");
    }

    private static void visualizarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
            return;
        }

        System.out.println("\nLISTA DE PRODUCTOS:");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void cargarProductos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            productos = (HashMap<String, Integer>) ois.readObject();
            System.out.println("Productos cargados del archivo");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró archivo de productos previo");
        } catch (Exception e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
        }
    }

    private static void guardarProductos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(productos);
            System.out.println("Productos guardados en " + ARCHIVO);
        } catch (Exception e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }
}