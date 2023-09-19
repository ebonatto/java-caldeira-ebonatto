public class ContaCorrente extends Conta{
    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public double calculaTributos() {
        return 42+(obterSaldo()*0.01);
    }
}
