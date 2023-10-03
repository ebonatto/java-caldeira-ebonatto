public class ContaBancaria {
    private String name;
    private double balance;

    public ContaBancaria(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (balance < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        } else {
            balance -= valor;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
