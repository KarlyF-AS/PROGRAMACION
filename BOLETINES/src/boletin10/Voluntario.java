package BOLETINES.src.boletin10;

public class Voluntario extends Traballador implements CalculoGastosIngreso {
    private int edade:
    private String profesion;
    private double horas;

    public Voluntario(int edade, String profesion, double horas, String dni, String nome, String dataIngreso) {
        super(dni, nome, dataIngreso);
        setEdade(edade);
        setProfesion(profesion);
        setHoras(horas);
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = Math.abs(edade);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = Math.abs(horas);
    }

    public String aCadeda() {
        String aux = ", con edade " + edade + ", con profesion " + profesion + ", traballa " + horas + " horas";
        return  super.aCadea() + aux;
    }

    @Override
    public double gastosIngreso() {
        return 0;-
    }
}
