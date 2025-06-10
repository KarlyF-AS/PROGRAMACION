import java.io.*;
import java.util.*;

public class NotaApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Engadir nota\n2. Listar notas\n3. Buscar\n4. Saír");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> engadirNota(sc);
                case 2 -> listarNotas();
                case 3 -> buscarNotas(sc);
            }
        } while (opcion != 4);
    }

    static void engadirNota(Scanner sc) throws IOException {
        System.out.print("Escribe a nota: ");
        String nota = sc.nextLine();
        try (FileWriter fw = new FileWriter("notas.txt", true)) {
            fw.write(nota + "\n");
        }
    }

    static void listarNotas() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {
            String liña;
            while ((liña = br.readLine()) != null) {
                System.out.println(liña);
            }
        }
    }

    static void buscarNotas(Scanner sc) throws IOException {
        System.out.print("Palabra clave: ");
        String palabra = sc.nextLine().toLowerCase();
        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {
            String liña;
            while ((liña = br.readLine()) != null) {
                if (liña.toLowerCase().contains(palabra)) {
                    System.out.println(liña);
                }
            }
        }
    }
}
