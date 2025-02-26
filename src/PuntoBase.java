/**
 * @autor: Karly Albarràn
 */
package src;

// Clase abstracta PuntoBase
public abstract class PuntoBase {
    private double x;
    private double y;

    // Constructor por defecto
    public PuntoBase() {
        x = 0;
        y = 0;
    }

    // Constructor con parámetros
    public PuntoBase(double x, double y) {
        setX(x);
        setY(y);
    }

    // Métodos getter y setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x < 0) this.x = 0;
        else this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y < 0) this.y = 0; // Corrección aquí
        else this.y = y;
    }

    // Método abstracto
    public abstract String aCadea();
}