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
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0;
    }
    //Constructor con parametros
    public Libro_eje1(String titulo, String autor, int ano, short numPaginas, float valoracion){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
    }
    public Libro_eje1(String titulo ,String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length()>0)this.titulo = titulo;
        else throw new RuntimeException("Título no encontrado");
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        if (valoracion>=0 && valoracion<=5)this.valoracion = valoracion;
        else throw new RuntimeException("Sin valoración");
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        if (numPaginas>0)this.numPaginas = numPaginas;
        else throw new RuntimeException("Número de páginas no encontrado");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>0 && ano<2025) this.ano = ano;
        else throw new RuntimeException("Año invalido");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void amorsar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + ano);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Valoración: " + valoracion);
    }
}