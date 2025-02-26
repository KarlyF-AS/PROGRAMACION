package src;
public abstract class cubo extends solido {
    private double lado;

    public cubo(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = Math.abs(lado);
    }
    public double calcularArea(){
        return lado * lado * 6;
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3);  // Volumen = lado³
    }
    public String aCadea (){
        return "CUbo de lado =" + lado + ", x=";
    }
}
