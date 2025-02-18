package boletin9;

import java.security.PrivateKey;
/**
 * Eje1 del boletin 9 de POO - Clase llamada libro
 * @version 1.0
 * @author Karly Albarrán
 */
public class Libro_eje1 {
    //Atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //Constructor por defecto
    public Libro_eje1 (){
        this.titulo = "...";
        this.autor = "...";
        this.ano = 0;
        this.numPaginas = 0;
    }
    //Constructor con parametros
    public Libro_eje1(String titulo, String autor, int ano, short numPaginas, float valoracion){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }
}


