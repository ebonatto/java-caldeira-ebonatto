public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Eduardo", "85674397015", "Yours Bank", "Instituto Caldeira");
        conta1.verificarSaldo();
        conta1.deposito(777.7);
        conta1.verificarSaldo();
        conta1.pix(1000);
        conta1.pix(111.1);
        conta1.verificarSaldo();
        conta1.saque(222.2);
        conta1.verificarHorario();

        ContaBancaria conta2 = new ContaBancaria("Dudi", "85674397015", "Yours Bank", "Instituto Caldeira");
        conta1.transferencia(conta2, 1000);
        conta1.transferencia(conta2, 303.3);
        conta1.saque(10.0);
        conta2.verificarSaldo();

        conta1.verificarExtrato();
    }
}