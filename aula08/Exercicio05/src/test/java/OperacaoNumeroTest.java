import org.example.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacaoNumeroTest {

    @Test
    void somaNumerosPositivos() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();
        int[] nPositivos1 = {1,3,5,7};
        int soma1 = operacaoNumero.somarNumeros(nPositivos1);
        int[] nPositivos2 = {15,20,100};
        int soma2 = operacaoNumero.somarNumeros(nPositivos2);
        int[] nPositivos3 = {1,1,1,1};
        int soma3 = operacaoNumero.somarNumeros(nPositivos3);

        Assertions.assertEquals(16, soma1);
        Assertions.assertEquals(135, soma2);
        Assertions.assertEquals(4, soma3);
    }

    @Test
    void somaNumerosNegativos() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();
        int[] nNegativos1 = {-1,-3,-5,-7};
        int soma1 = operacaoNumero.somarNumeros(nNegativos1);
        int[] nNegativos2 = {-15,-20,-100};
        int soma2 = operacaoNumero.somarNumeros(nNegativos2);
        int[] nNegativos3 = {-1,-1,-1,-1};
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
}
