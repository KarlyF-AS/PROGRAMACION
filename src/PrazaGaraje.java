public class PrazaGaraje extends Inmoble {
    private String ancho;
    private String longo;
    private int numeroPraza;
    private boolean adega;
    private boolean trasteiro;

    public PrazaGaraje(String rua, int numero, String localidad, double prezo, String ancho, String longo, int numeroPraza, boolean adega, boolean trasteiro) {
        super(rua, numero, localidad, prezo);
        this.ancho = ancho;
        this.longo = longo;
        this.numeroPraza = numeroPraza;
        this.adega = adega;
        this.trasteiro = trasteiro;
    }

    @Override
    public double calcularGananciaVenta() {
        return prezo * 0.03; // 3% de ganancia
    }

    @Override
    public double calcularGananciaAlquiler(double valorAlquilerMensual) {
        return valorAlquilerMensual; // Ganancia del primer mes de alquiler
    }

    @Override
    public String toString() {
        return super.toString() + ", PrazaGaraxe: Ancho=" + ancho + ", Longo=" + longo +
                ", Número Praza=" + numeroPraza + ", Adega=" + adega + ", Trasteiro=" + trasteiro;
    }
}