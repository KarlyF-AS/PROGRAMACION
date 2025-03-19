public abstract class InmobleEdificio extends Inmoble {
    protected String portal;
    protected String piso;

    public InmobleEdificio(String rua, int numero, String localidad, double prezo, String portal, String piso) {
        super(rua, numero, localidad, prezo);
        this.portal = portal;
        this.piso = piso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portal=" + portal + ", Piso=" + piso;
    }
}