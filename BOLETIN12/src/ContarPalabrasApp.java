import java.io.*;
import java.util.*;

public class ContarPalabrasApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro: ");
        String nome = sc.nextLine();

        Map<String, Integer> mapa = new HashMap<>();
        try (Scanner fileScanner = new Scanner(new File(nome))) {
            while (fileScanner.hasNext()) {
                String palabra = fileScanner.next().toLowerCase().replaceAll("[^a-záéíóúñü]", "");
                mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
            }
        }

        try (PrintWriter pw = new PrintWriter("resumo_palabras.txt")) {
            for (Map.Entry<String, Integer> e : mapa.entrySet()) {
                pw.println(e.getKey() + ": " + e.getValue());
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }
    }
}
