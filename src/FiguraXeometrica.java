package src;

public abstract class FiguraXeometrica  extends PuntoBase{
    public FiguraXeometrica(){
        super ();
    }
    public FiguraXeometrica(double x, double y){
        super(x, y);
    }
    public double calcularPerimetro(){
        return 0.0;
    }
    public abstract double calcularArea();
}
