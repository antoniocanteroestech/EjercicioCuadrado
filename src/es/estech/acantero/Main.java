package es.estech.acantero;

public class Main {

    /**
     * Dibuja un cuadrado de n elementos de lado utilizando *. Utiliza POO y herencia,
     * de modo que el programa sea fácilmente escalable.
     * @param args
     */

    public static void main(String[] args) {

        Square sq = new Square(5, '*');
        sq.draw();

        Square sq1 = new Square(10, '0');
        sq1.draw();

    }
}
