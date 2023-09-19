public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nome) {
        super(nome);
    }

    @Override
    public double calculaTributos() {
        return 0;
    }
}
