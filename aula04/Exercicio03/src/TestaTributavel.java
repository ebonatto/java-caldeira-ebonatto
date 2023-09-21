import java.util.ArrayList;
import java.util.List;

public class TestaTributavel {
    public static void main(String[] args) {
        Conta corrente = new ContaCorrente("Du");
        Conta poupanca = new ContaPoupanca("Dudu");
        SeguroDeVida seguroVida = new SeguroDeVida();
        corrente.deposito(1000);
        poupanca.deposito(1000);

        System.out.println("Tributo conta corrente: R$ " + corrente.calculaTributos());
        System.out.println("Tributo conta poupanca: R$ " + poupanca.calculaTributos());
        System.out.println("Tributo Seguro de Vida: R$ " + seguroVida.calculaTributos());

        List<Tributavel> contas = new ArrayList<>();
        contas.add(corrente);
        contas.add(seguroVida);
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda(contas);
        gerenciador.getTributaveis();

        System.out.println(gerenciador);

        GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();

        gerenciadorDeImpostoDeRenda.adicionar(seguroVida);
        System.out.println(gerenciadorDeImpostoDeRenda.getTotalTributos());

    }
}
