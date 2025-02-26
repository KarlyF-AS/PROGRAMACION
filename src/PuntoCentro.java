/**
 * @autor: Karly Albarràn
 */

package src;
public class PuntoCentro extends PuntoBase {

    // Constructor por defecto
    public PuntoCentro() {
        super(); // Llama al constructor de la clase padre
    }

    // Constructor con parámetros
    public PuntoCentro(double x, double y) {
        super(x, y); // Llama al constructor de la clase padre con valores
    }

    // Implementación del método abstracto
    @Override
    public String aCadea() {
        return "O punto centro ten como coordenada (" + getX() + ", " + getY() + ")";
    }
}