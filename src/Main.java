package src;

import src.clase_abstracta_Animal.Canguro;
import src.clase_abstracta_FiguraXeometricas.PuntoCentro;
import src.clase_abstracta_FiguraXeometricas.solido;

public class Main {
    public static void main(String[] args) {
        String[] habilidades = {"cavar", "salto olimpico", "voar"};
        String[] equipamentos = {"pala", "pertiga", "alas", "piedra", "pau", "verme", "serra"};

        Persoaxe goku = new Persoaxe("Dolar", 2, 4, -15, 50, 21, "soldado", habilidades, equipamentos);
        System.out.println("A velocidade de goku e : " + goku.getVelocidade()); //consulta a propiedade velocidade en Personaxe


        Punto p1 = new Punto(1, 7);
        Punto p2 = new Punto(-15); //como solo permite valores negativos lo iguala a 0

        p1.setX(-10);

        System.out.println("Coordenada x de p1 : " + p1.getX());
        System.out.println("Coordenada x de p2 : " + p2.getX());
        System.out.println("Coordenada x de p2 : " + p2.getY());

        //devuelve verdadero o falso en caso de que sean o no iguales, sin embargo va a dar error aunque cambie el valor de -15 a 0
        System.out.println(p1.equals(p2));

        System.out.println(p1); //utiliza el metodo toString modificado en la propia clase para que nos muestre el resultado de las coordenadas


        //Pruebas con clase círculo
        Circulo circulo1 = new Circulo(5, 4, 3);

        //utilizar toString directa e indirectamente
        System.out.println(circulo1.toString());
        //System.out.println(circulo1);

        System.out.println("Coordenadas  X de circulo 1: " + circulo1.getX()); //hereda el metodo de getX de la clase punto

        System.out.print("El radio de la circunferencia es: ");
        System.out.println(circulo1.calculoDiametro());

        System.out.print("El area del circulo es :");
        System.out.println(circulo1.calculoArea());

        System.out.print("El perimetro del circulo es :");
        System.out.println(circulo1.calculoPerimetro());


        //Clase cilindro
        Cilindro cil1 = new Cilindro(2, 3, 4, 5);
        System.out.println(cil1.toString());
        System.out.println("O perímetro do cilindro é: " + cil1.calcularSuperficie());
        System.out.println("O volumen do cilindro é: " + cil1.calcularVolumen());

        System.out.println(CuentaCorriente.);
        CuentaCorriente contaManuel = new CuentaCorriente("0111", "00000025R", "1032");
        System.out.println(CuentaCorriente);

        Lista2 lista2 = new Lista2();
        lista.engadirUltimo(5);
        PuntoCentro p3 = new PuntoCentro();
        Cadrado cadrado1 = new Cadrado(2. 1);
        System.out.println("Superficie cadrdao: " + cadrado1.aCadea());
        System.out.println("Perímetro do cadrado");
        Cubo cubo = new solido() {}
        Canguro nai = new Canguro("Mai", "13");
        nai.desprazar();
        nai.voz();

    }
}