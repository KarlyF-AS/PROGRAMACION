package Nodo;

public class lista2 {
    private Nodo nodoInicial;
    private int tamanho;

    public lista2() {
        this.nodoInicial = null;
        tamanho = 0;
    }

    public lista2(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
        tamanho = 1;
    }

    public boolean estaValeira() {
        if (nodoInicial == null) return true;
        else return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void engadirUltimo(int nValor) {
        Nodo novoNodo = new Nodo(nValor, null);
        if (estaValeira() == true) ;
        nodoInicial = novoNodo;
        tamanho = 1;
    }
    else

    {
        Nodo nodoActual = nodoInicial;
        while (nodoActual.getNodoseguinte() != null) {
            nodoActual = nodoActual.getNodoSeguinte();
        }
        nodoActual.setNodoseguinte(novoNodo);
        tamanho++;
    }
}
//Hacer metodo listar(): void
//