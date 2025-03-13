package src.Nodo;

public class Nodo {
    private int valor;
    private Nodo nodoSeguinte;

    public Nodo (int Valor, Nodo nSeguinte){
       this.valor = Valor;
       nodoSeguinte = nSeguinte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        valor = valor;
    }

    public Nodo getNodoseguinte() {
        return nodoSeguinte;
    }

    public void setNodoseguinte(Nodo nodoSeguinte) {
        this.nodoSeguinte = nodoSeguinte;
    }
}
