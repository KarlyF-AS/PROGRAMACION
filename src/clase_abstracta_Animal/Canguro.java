package src.clase_abstracta_Animal;

public class Canguro extends Mamifero implements Son{
    public Canguro(String nome, String edad){
        super(nome, edad);
    }

    @Override
    public void desprazar() {
        System.out.println(getNome() + "Se desprazarse saltando");
    }

    @Override
    public String parir() {
        return "Bebé";
    }

    @Override
    public void voz() {
        System.out.println("Ehiiiiiiiiaaa");
    }
}
