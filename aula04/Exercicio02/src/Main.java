import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Formas geométrica\n");

        FormaGeometrica[] formas = {
                new Retangulo(7,10),
                new Triangulo(7,10),
                new Circulo(7),
                new Quadrado(7),
                new Losango(7,10)
        };

        for(FormaGeometrica forma : formas ) {
            System.out.println(forma);
        }

    }
}