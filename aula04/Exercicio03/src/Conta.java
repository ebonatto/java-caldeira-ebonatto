public abstract class Conta implements Tributavel{
    private String nome;
    private double saldo;

    public Conta(String nome) {
        this.nome = nome;
    }

    public String obterNome() {
        return nome;
    }

    public double obterSaldo() {
        return saldo;
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saldo restante: R$ %.2f\n");
            return true;
        } else {
            System.out.printf("Saldo insuficiente! Saldo atual: R$ %.2f\n", obterSaldo());
            return false;
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito efetuado! Saldo atual: R$ %.2f\n", obterSaldo());
    }


}
