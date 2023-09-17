import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Eduardo", "06485497048", "Yours Bank", "Instituto Caldeira");
        conta1.verificarSaldo();
        conta1.deposito(777.7);
        conta1.verificarSaldo();
        conta1.pix(1000);
        conta1.pix(111.1);
        conta1.verificarSaldo();
        conta1.saque(222.2);
        conta1.verificarHorario();
        conta1.verificarInformacoes();

        ContaBancaria conta2 = new ContaBancaria("Jean", "74680834013", "Yours Bank", "Instituto Caldeira");
        conta1.transferencia(conta2, 1000);
        conta1.transferencia(conta2, 303.3);
        conta1.saque(10.0);
        conta2.verificarSaldo();
        conta2.verificarInformacoes();
        conta2.alterarEndereco("");
        conta2.alterarEndereco("DC Shopping");
        conta2.verificarInformacoes();

        conta2.fechaConta();
        conta2.deposito(100);
        conta1.transferencia(conta2, 100);
        conta2.verificarExtrato();

        conta1.verificarExtrato();


    }
}