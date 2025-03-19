public class Main {
    public static void main(String[] args) {
        PrazaGaraje garaje = new PrazaGaraje( "Rúa Principe", 15, "Vigo", 15000, "5m", "7m", 10, true, false);
        LocalesC local = new LocalesC("Rúa Garcia Barbón", 87, "Vigo", 200000, "Portal H", "Piso 3", 250, true, "Con buena iluminación");
        Viviendas vivienda = new Viviendas("Torrecedeira", 3, "Vigo", 120000, "Portal B", "Piso 5", 4, true, true, false, "Con vistas al parque");

        System.out.println(garaje);
        System.out.println("Ganancia de venta por garaje: " + garaje.calcularGananciaVenta());
        System.out.println("Ganancia de alquiler por garaje: " + garaje.calcularGananciaAlquiler(500));

        System.out.println(local);
        System.out.println("Ganancia de venta del local: " + local.calcularGananciaVenta());

        System.out.println(vivienda);
        System.out.println("Ganancia de venta por la vivienda: " + vivienda.calcularGananciaVenta());
    }
}