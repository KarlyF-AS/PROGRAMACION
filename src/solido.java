package src;

public abstract class solido extends FiguraXeometrica {
    public solido() {
        super();
    }
    // Constructor con parámetros (llama al constructor de FiguraXeometrica)
    public solido(double x, double y) {
        super(x, y);
    }
    public abstract double calcularVolumen();
}
