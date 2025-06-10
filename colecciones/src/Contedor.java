public class Contedor <T> { // <T> es generico
    private T obxecto;
    public Contedor(){}

    void gardar (T novo){
        obxecto = novo;
    }
    T extraer (){
        T res = obxecto;
        obxecto = null;
        return res;
    }
}
/*
interfaces nomeInterface <T>{
   ...
}
public interface Comparable <T>{
   ...
}
pubic nomeClase<T extendes claseLimite>{
   ...
}
pubic nomeClase<T super  claseLimite>{
   ...
}
*/