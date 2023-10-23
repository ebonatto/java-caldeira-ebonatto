import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void adicao() {
        Calculadora calculadora = new Calculadora();

        double adicao1 = calculadora.adicao(2, 5);
        double adicao2 = calculadora.adicao(15, 62);
        double adicao3 = calculadora.adicao(888.8, -111.1);

        Assertions.assertEquals(7, adicao1);
        Assertions.assertEquals(77, adicao2);
        Assertions.assertEquals(777.7, adicao3);
    }

    @Test
    void subtracao() {
        Calculadora calculadora = new Calculadora();

        double subtracao1 = calculadora.subtracao(16, 10);
        double subtracao2 = calculadora.subtracao(108, 42);
        double subtracao3 = calculadora.subtracao(555.5, -111.1);

        Assertions.assertEquals(6, subtracao1);
        Assertions.assertEquals(66, subtracao2);
        Assertions.assertEquals(666.6, subtracao3);
    }

    @Test
    void multiplicacao() {
        Calculadora calculadora = new Calculadora();

        double multiplicacao1 = calculadora.multiplicacao(2, 5);
        double multiplicacao2 = calculadora.multiplicacao(17, 118);
        double multiplicacao3 = calculadora.multiplicacao(83, 23);

        Assertions.assertEquals(10, multiplicacao1);
        Assertions.assertEquals(2006, multiplicacao2);
        Assertions.assertEquals(1909, multiplicacao3);
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();

        double divisao1 = calculadora.divisao(13, 3);
        double divisao2 = calculadora.divisao(2006, 118);
        double divisao3 = calculadora.divisao(5439, 7);


        Assertions.assertEquals(4.33, divisao1);
        Assertions.assertEquals(17, divisao2);
        Assertions.assertEquals(777, divisao3);
    }

    @Test
    void divisaoPorZero() {
        Calculadora calculadora = new Calculadora();

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> calculadora.divisao(6, 0));
        String expectedMessage = "Divisao por zero!";
        String exceptionMessage = exception.getMessage();

        Assertions.assertTrue(exceptionMessage.contains(expectedMessage));
    }

    @Test
    void raizQuadrada() {
        Calculadora calculadora = new Calculadora();

        double raizQuadrada1 = calculadora.raizQuadrada(16);
        double raizQuadrada2 = calculadora.raizQuadrada(121);
        double raizQuadrada3 = calculadora.raizQuadrada(777);

        Assertions.assertEquals(4, raizQuadrada1);
        Assertions.assertEquals(11, raizQuadrada2);
        Assertions.assertEquals(27.87, raizQuadrada3);
    }

    @Test
    void raizQuadradaNegativa() {
        Calculadora calculadora = new Calculadora();

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> calculadora.raizQuadrada(-666));
        String expectedMessage = "Raiz de numero negativo!";
        String exceptionMessage = exception.getMessage();

        Assertions.assertTrue(exceptionMessage.contains(expectedMessage));
    }

    @Test
    void potencia() {
        Calculadora calculadora = new Calculadora();

        double potencia1 = calculadora.potencia(2, 5);
        double potencia2 = calculadora.potencia(15, 3);
        double potencia3 = calculadora.potencia(7.7, 7);

        Assertions.assertEquals(32, potencia1);
        Assertions.assertEquals(3375, potencia2);
        Assertions.assertEquals(1604852.33, potencia3);
    }

    @Test
    void calculaHipoteca() {
        Calculadora calculadora = new Calculadora();

        double hipoteca1 = calculadora.calculaHipoteca(15000, 6, 1);
        double hipoteca2 = calculadora.calculaHipoteca(126709, 15, 3);
        double hipoteca3 = calculadora.calculaHipoteca(777777, 7, 7);

        Assertions.assertEquals(1325, hipoteca1);
        Assertions.assertEquals(4047.55, hipoteca2);
        Assertions.assertEquals(9907.4, hipoteca3);
    }
}
