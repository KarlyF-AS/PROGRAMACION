package src.clase_abstracta_Animal;

public class Can extends Mamifero implements Comunicacion{

    //Constructor
    public Can(String nome, int edad){
        super(nome, edad);
    }

    public String parir(){
        return "Un canciño";
    }
    public void desprazar(){
        System.out.println("Corre");
    }
    public void ronroneo(){
        System.out.println("umm-ummm");
    }
    public void voz (){
        System.out.println("Guau guau");
    }

}
