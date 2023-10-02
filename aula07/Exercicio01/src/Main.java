import Shapes.Circulo;
import Shapes.Desenhavel;
import Shapes.Quadrado;

public class Main {
    public static void main(String[] args) {
        Desenhavel circle = new Circulo();
        Desenhavel square = new Quadrado();

        circle.desenhar();
        square.desenhar();
    }
}