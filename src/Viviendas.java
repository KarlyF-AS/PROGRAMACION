public class Viviendas extends InmobleEdificio {
    private int numeroHabitaciones;
    private boolean prazaGaraxe;
    private boolean trasteiro;
    private boolean adega;
    private String observacions;

    public Viviendas(String rua, int numero, String localidad, double prezo, String portal, String piso,
                     int numeroHabitaciones, boolean prazaGaraxe, boolean trasteiro, boolean adega, String observacions) {
        super(rua, numero, localidad, prezo, portal, piso);
        this.numeroHabitaciones = numeroHabitaciones;
        this.prazaGaraxe = prazaGaraxe;
        this.trasteiro = trasteiro;
        this.adega = adega;
        this.observacions = observacions;
    }

    @Override
    public double calcularGananciaVenta() {
        return prezo * 0.02; // 2% de ganancia
    }

    @Override
    public double calcularGananciaAlquiler(double valorAlquilerMensual) {
        return valorAlquilerMensual; // Ganancia del primer mes de alquiler
    }

    @Override
    public String toString() {
        return super.toString() + ", Vivienda: Habitaciones=" + numeroHabitaciones +
                ", Praza Garaxe=" + prazaGaraxe + ", Trasteiro=" + trasteiro +
                ", Adega=" + adega + ", Observacións=" + observacions;
    }
}