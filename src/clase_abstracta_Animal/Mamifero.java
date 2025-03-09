/**
 * Clase abstracta
 *  @version 1.0
 * @autor: Karly Albarrán
 */
package src.clase_abstracta_Animal;
public abstract class Mamifero extends Animal {
    public Mamifero(String nome, int edad) {
        super(nome, edad);
    }
        public void mamar (){
         System.out.println(getNome() + "está mamando");
    }
        public abstract String parir();
}
