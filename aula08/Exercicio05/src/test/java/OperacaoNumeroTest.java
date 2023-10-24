import org.example.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacaoNumeroTest {

    @Test
    void somaNumerosPositivos() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();
        int[] nPositivos1 = {1, 3, 5, 7};
        int soma1 = operacaoNumero.somarNumeros(nPositivos1);
        int[] nPositivos2 = {15, 20, 100};
        int soma2 = operacaoNumero.somarNumeros(nPositivos2);
        int[] nPositivos3 = {1, 1, 1, 1};
        int soma3 = operacaoNumero.somarNumeros(nPositivos3);

        Assertions.assertEquals(16, soma1);
        Assertions.assertEquals(135, soma2);
        Assertions.assertEquals(4, soma3);
    }

    @Test
    void somaNumerosNegativos() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();
        int[] nNegativos1 = {-1, -3, -5, -7};
        int soma1 = operacaoNumero.somarNumeros(nNegativos1);
        int[] nNegativos2 = {-15, -20, -100};
        int soma2 = operacaoNumero.somarNumeros(nNegativos2);
        int[] nNegativos3 = {-1, -1, -1, -1};
        int soma3 = operacaoNumero.somarNumeros(nNegativos3);

        Assertions.assertEquals(-16, soma1);
        Assertions.assertEquals(-135, soma2);
        Assertions.assertEquals(-4, soma3);
    }


    @Test
    void somaNumerosVazio() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();
        int[] nVazio = {};
        int soma = operacaoNumero.somarNumeros(nVazio);

        Assertions.assertEquals(0, soma);
    }

    @Test
    void ehParPares() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        int par1 = 2;
        int par2 = -31234;
        int par3 = 0;

        Assertions.assertTrue(operacaoNumero.ehPar(par1));
        Assertions.assertTrue(operacaoNumero.ehPar(par2));
        Assertions.assertTrue(operacaoNumero.ehPar(par3));
    }

    @Test
    void ehParImpares() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        int impar1 = 21;
        int impar2 = -312341;
        int impar3 = 1;

        Assertions.assertFalse(operacaoNumero.ehPar(impar1));
        Assertions.assertFalse(operacaoNumero.ehPar(impar2));
        Assertions.assertFalse(operacaoNumero.ehPar(impar3));
    }

    @Test
    void calcularFatorialPositivos() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        int n1 = 5;
        int n2 = 10;
        int n3 = 3;

        Assertions.assertEquals(120, operacaoNumero.calcularFatorial(n1));
        Assertions.assertEquals(3628800, operacaoNumero.calcularFatorial(n2));
        Assertions.assertEquals(6, operacaoNumero.calcularFatorial(n3));
    }

    @Test
    void calcularFatorialNegativo() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            operacaoNumero.calcularFatorial(-5);
        });
    }

    @Test
    void calcularFatorialZero() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(0));
    }

    @Test
    void ehPalindromoTrue() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        String str1 = "arara";
        String str2 = "Ame o poema";
        String str3 = "amor a Roma";

        Assertions.assertTrue(operacaoNumero.ehPalindromo(str1));
        Assertions.assertTrue(operacaoNumero.ehPalindromo(str2));
        Assertions.assertTrue(operacaoNumero.ehPalindromo(str3));
    }

    @Test
    void ehPalindromoFalse() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        String str1 = "Eduardo";
        String str2 = "Bonatto";
        String str3 = "Costa";

        Assertions.assertFalse(operacaoNumero.ehPalindromo(str1));
        Assertions.assertFalse(operacaoNumero.ehPalindromo(str2));
        Assertions.assertFalse(operacaoNumero.ehPalindromo(str3));
    }

    @Test
    void ehPalindromoVazio() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertTrue(operacaoNumero.ehPalindromo(""));
    }

    @Test
    void calcularFibonacciNegativo() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            operacaoNumero.calcularFibonacci(-1);
        });
    }

    @Test
    void calcularFibonacciZero() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertEquals(0, operacaoNumero.calcularFibonacci(0));
    }

    @Test
    void calcularFibonacciUm() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertEquals(1, operacaoNumero.calcularFibonacci(1));
    }

    @Test
    void calcularFibonacciNesimo() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        Assertions.assertEquals(5, operacaoNumero.calcularFibonacci(5));
        Assertions.assertEquals(55, operacaoNumero.calcularFibonacci(10));
        Assertions.assertEquals(377, operacaoNumero.calcularFibonacci(14));
    }
}
