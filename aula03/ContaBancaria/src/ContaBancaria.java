import java.util.Date;
import java.text.SimpleDateFormat;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta = 0;
    private static int numeroContas = 0;
    private String banco;
    private String endereco;
    private double saldo = 0;
    private Date horarioAtual;

    public ContaBancaria(String nome, String cpf, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.banco = banco;
        this.endereco = endereco;
        numeroContas++;
        this.identificadorConta = numeroContas;
    }

    public static boolean validaCPF(String cpf) {
        int total = 0;
        int tamanhoCPF = 10;
        if (cpf.length() != tamanhoCPF) {
            return false;
        }

        int n = Integer.parseInt(String.valueOf(cpf.charAt(0)));
        boolean iguais = true;
        for (int i = 0; i < tamanhoCPF; i++) {
            if (n == Integer.parseInt(String.valueOf(cpf.charAt(i)))) {
                iguais = false;
                i = tamanhoCPF;
            }
        }

        for (int i = 0; i < tamanhoCPF - 2; i++) {
            total += (tamanhoCPF - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        int resto = (total * 10) % 11 == 10 ? 0 : (total * 10) % 11;
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(8)))) {
            return false;
        }
        total = 0;
        for (int i = 0; i < tamanhoCPF - 1; i++) {
            total += (tamanhoCPF - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            return false;
        }
        return true;
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void pix(double valor) {
        this.saque(valor);
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (this.saque(valor)) {
            return;
        }
        ;
        atualizaHorario();
        if (this.horarioAtual.getHours() < 8 || this.horarioAtual.getHours() > 19) {
            System.out.println("Fora do horário! Transferências só podem ocorrer das 8h às 19h!");
            verificarHorario();
        }
    }

    public void verificarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }

    public void verificarHorario() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        atualizaHorario();
        System.out.printf("Horario atual: %s\n", formatter.format(this.horarioAtual));
    }

    public void atualizaHorario() {
        this.horarioAtual = new Date();
    }

    public void verificarInformacoes() {
        System.out.printf("Nome: %s\n" +
                        "CPF: %s\n" +
                        "Saldo %.2f\n" +
                        "Endereço: %s\n" +
                        "Banco: %s\n" +
                        "ID Conta: %s\n",
                this.nome, this.cpf,
                this.saldo, this.endereco, this.banco, this.identificadorConta);
    }
}
