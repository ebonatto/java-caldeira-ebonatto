public class Main {
    public static void main(String[] args) {
        ContaBancaria account = new ContaBancaria("Eduardo", 777.7);
        try {
            System.out.println(account.getBalance());
            account.sacar(111.1);
            System.out.println(account.getBalance());
            account.sacar(1000);
        } catch (SaldoInsuficienteException sie) {
            System.out.println(sie.getMessage());
        }
    }
}