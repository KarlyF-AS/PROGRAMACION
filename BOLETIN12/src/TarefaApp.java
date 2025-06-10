import java.io.*;
import java.util.*;

public class TarefaApp {
    static List<Tarefa> tarefas = new ArrayList<>();
    static final String FILE = "tarefas.dat";

    public static void main(String[] args) {
        cargar();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Engadir\n2. Modificar\n3. Borrar\n4. Listar\n5. Saír");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> engadir(sc);
                case 2 -> modificar(sc);
                case 3 -> borrar(sc);
                case 4 -> listar();
                case 5 -> gardar();
            }
        } while (opcion != 5);
    }

    static void engadir(Scanner sc) {
        System.out.print("Data: ");
        String data = sc.nextLine();
        System.out.print("Hora: ");
        String hora = sc.nextLine();
        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Descrición: ");
        String desc = sc.nextLine();
        System.out.print("Feita (true/false): ");
        boolean feita = sc.nextBoolean();
        sc.nextLine();
        tarefas.add(new Tarefa(data, hora, duracion, nome, desc, feita));
    }

    static void modificar(Scanner sc) {
        listar();
        System.out.print("Índice a modificar: ");
        int i = sc.nextInt();
        sc.nextLine();
        if (i >= 0 && i < tarefas.size()) {
            Tarefa t = tarefas.get(i);
            System.out.print("Nova data: ");
            t.data = sc.nextLine();
            System.out.print("Nova hora: ");
            t.hora = sc.nextLine();
            System.out.print("Nova duración: ");
            t.duracion = sc.nextInt();
            sc.nextLine();
            System.out.print("Novo nome: ");
            t.nome = sc.nextLine();
            System.out.print("Nova descrición: ");
            t.descricion = sc.nextLine();
            System.out.print("Feita (true/false): ");
            t.feita = sc.nextBoolean();
            sc.nextLine();
        }
    }

    static void borrar(Scanner sc) {
        listar();
        System.out.print("Índice a borrar: ");
        int i = sc.nextInt();
        sc.nextLine();
        if (i >= 0 && i < tarefas.size()) {
            tarefas.remove(i);
        }
    }

    static void listar() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + ": " + tarefas.get(i));
        }
    }

    static void cargar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            tarefas = (List<Tarefa>) ois.readObject();
        } catch (Exception e) {
            tarefas = new ArrayList<>();
        }
    }

    static void gardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(tarefas);
        } catch (IOException e) {
            System.out.println("Erro gardando tarefas.");
        }
    }
}
