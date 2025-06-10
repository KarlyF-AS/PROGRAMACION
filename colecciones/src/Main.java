public class Main {
    public static void main(String[] args) {
    Contedor<Integer> num = new Contedor<Integer>();
    num.gardar(5);
    System.out.println(num.extraer()); // Aqui imprimimos (extraemos) el valor del numero

    Contedor<String> cad = new Contedor<String>();
        cad.gardar("Olaaa");
        String c = cad.extraer();
        System.out.println(c); // Aqui un String (cadena)

    Contedor ele = new Contedor();
    ele.gardar ("Pera");
    Object o = ele.extraer();
    System.out.println(o);

    Double [] temp = new Double [5];
    temp [0] = 2.3;
    temp [1] = 15.53;
    temp [2] = 22.43;
    temp [3] = -5.66;
    temp [4] = 15.77;
    ContedorElementos <Double> t = new ContedorElementos <> (temp);
    t.apilar(2.45);
    t.apilar(33.56);
    t.enconlar(12.45);
    t.enconlar(41.44);
        System.out.println(t.desapilar()); // Desapilamos el último elemento
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desenconlar());
    }
}