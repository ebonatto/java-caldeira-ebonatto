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
    }
}
