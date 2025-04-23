import java.util.Arrays;

public class ContedorElementos <T> implements Pila<T> {
    private T[] obxectos;

    public ContedorElementos(T[] obxectos) {
        this.obxectos = obxectos;
    }

    public void apilar(T novo) {
        obxectos = Arrays.copyOf(obxectos, obxectos.length + 1);
        obxectos[obxectos.length - 1] = novo;
    }

    public T desapilar() {
        T res = null;
        if (obxectos.length > 0) {
            res = obxectos[obxectos.length - 1];
            obxectos = Arrays.copyOf(obxectos, obxectos.length - 1);
        }
        return res;
    }

    public T enconlar(T novo) {
        apilar(novo);

    return novo;}

    public T desenconlar() {
        T res = null;
        if (obxectos.length > 0) {
            res = obxectos[0];
            obxectos = Arrays.copyOfRange(obxectos, 1, obxectos.length);
        }
        return res;
    }
}
