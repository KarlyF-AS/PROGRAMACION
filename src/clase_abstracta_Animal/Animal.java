/**
 * Clase abstracta
 *  @version 1.0
 * @autor: Karly Albarrán
 */
package src.clase_abstracta_Animal;

public abstract class Animal {
    //atributos de la clase
    private String nome;
    private int edad;

    //Constructor de la clase
    public Animal(String nome, int edad){
        this.nome = nome;
        this.edad = edad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = Math.abs(edad);
    }

    public void comer(){
        System.out.println(nome + "Esta comiendo");
    }
    public void durmir(){
        System.out.println(nome + "Esta durmiendo");
    }
    public abstract void desprazar();
}
