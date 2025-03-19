public abstract class Inmoble implements GananciaCalculable {
    protected String rua;
    protected int numero;
    protected String localidad;
    protected double prezo;

    public Inmoble(String rua, int numero, String localidad, double prezo) {
        this.rua = rua;
        this.numero = numero;
        this.localidad = localidad;
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Inmoble: Rúa: " + rua + ", Número: " + numero + ", Localidade: " + localidad + ", Prezo: " + prezo;
    }
}