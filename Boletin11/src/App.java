import eje1.*;
import eje2.*;

public class App {
    public static void main(String[] args) {
        // Pruebas para Eje1 (Person y Deportista)
        probarEje1();

        // Pruebas para Eje2 (Data)
        probarEje2();
    }

    private static void probarEje1() {
        System.out.println("--- Probando Eje1 (Person/Deportista) ---");
        try {
            Person persona = new Person();
            persona.setDni("12345678A"); // Válido
            System.out.println("DNI válido: " + persona.getDni());

            Deportista deportista = new Deportista();
            deportista.setLicencia("2023fut123456"); // Válido
            System.out.println("Licencia válida: " + deportista.getLicencia());

            // Ejemplos que lanzan excepciones (descomentar para probar):
            // persona.setDni("1234A"); // DNI inválido
            // deportista.setLicencia("202fut123456"); // Licencia inválida

        } catch (DniNonValido e) {
            System.out.println("Error en DNI: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en licencia: " + e.getMessage());
        }
    }

    private static void probarEje2() {
        System.out.println("\n--- Probando Eje2 (Data) ---");
        try {
            Data data1 = new Data();
            data1.setData(29, 2, 2024); // Año bisiesto (válido)
            System.out.println("Fecha válida: " + data1);

            Data data2 = new Data();
            data2.setData(31, 4, 2023); // Abril tiene 30 días (inválido)
            System.out.println("Fecha válida: " + data2); // No se ejecutará

        } catch (FormatoDataErroneo e) {
            System.out.println("Error en fecha: " + e.getMessage());
        }
    }
}