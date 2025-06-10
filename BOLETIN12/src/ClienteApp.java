import java.io.*;
import java.util.*;

public class ClienteApp {
    static List<Cliente> clientes = new ArrayList<>();
    static final String FILE = "clientes.dat";

    public static void main(String[] args) {
        cargarClientes();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Engadir cliente\n2. Modificar\n3. Borrar\n4. Listar\n5. Saír");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> engadirCliente(sc);
                case 2 -> modificarCliente(sc);
                case 3 -> borrarCliente(sc);
                case 4 -> listarClientes();
                case 5 -> gardarClientes();
            }
        } while (opcion != 5);
    }

    static void engadirCliente(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        clientes.add(new Cliente(id, nome, telefono));
    }

    static void modificarCliente(Scanner sc) {
        System.out.print("ID do cliente: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Cliente c : clientes) {
            if (c.id == id) {
                System.out.print("Novo nome: ");
                c.nome = sc.nextLine();
                System.out.print("Novo teléfono: ");
                c.telefono = sc.nextLine();
                return;
            }
        }
        System.out.println("Cliente non atopado.");
    }

    static void borrarCliente(Scanner sc) {
        System.out.print("ID a borrar: ");
        int id = sc.nextInt();
        clientes.removeIf(c -> c.id == id);
    }

    static void listarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    static void cargarClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (Exception e) {
            clientes = new ArrayList<>();
        }
    }

    static void gardarClientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Erro gardando clientes.");
        }
    }
}
