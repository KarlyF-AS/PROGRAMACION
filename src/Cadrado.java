package src;

public class Cadrado extends FiguraXeometrica{
    private double lado;

    public Cadrado(double l){
        super ();
        setLado ();
    }
    public  Cadrado (double x, double y, double l){
        super(x, y);
        setLado(l);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = Math.abs(lado);
    }
    @Override
    public double calcularPerimetro(){
        return lado + lado;
    }
    public double calcularArea(){
        return lado * lado;
    }
    public String aCadea (){
        return "O Cadrado de lado=" + lado + "x, y";
    }
}
