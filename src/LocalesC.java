public class LocalesC extends InmobleEdificio {
    private double m2;
    private boolean acondicionado;
    private String observacions;

    public LocalesC(String rua, int numero, String localidad, double prezo, String portal, String piso, double m2, boolean acondicionado, String observacions) {
        super(rua, numero, localidad, prezo, portal, piso);
        this.m2 = m2;
        this.acondicionado = acondicionado;
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
        return super.toString() + ", Locales Comerciales: Metros Cuadrados=" + m2 +
                ", Acondicionado=" + acondicionado + ", Observacións=" + observacions;
    }
}