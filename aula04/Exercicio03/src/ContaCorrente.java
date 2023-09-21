public class ContaCorrente extends Conta{
    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public double calculaTributos() {
        return obterSaldo()*0.01;
    }

    @Override
    public String toString() {
        return String.format("Conta corrente - Titular: %s", this.obterNome());
    }
}
