import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta = 0;
    private static int numeroContas = 0;
    private String banco;
    private String endereco;
    private double saldo = 0;
    private Date horarioAtual;
    private List<String> extrato = new ArrayList<>();
    private boolean aberta = true;

    public ContaBancaria(String nome, String cpf, String banco, String endereco) {
        if (validaCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
            return;
        }
        this.nome = nome;
        this.banco = banco;
        this.endereco = endereco;
        numeroContas++;
        this.identificadorConta = numeroContas;
    }

    private boolean validaCPF(String cpf) {
        int total = 0;
        int tamanhoCPF = 11;
        if (cpf.length() != tamanhoCPF) {
            return false;
        }

        int n = Integer.parseInt(String.valueOf(cpf.charAt(0)));
        boolean iguais = true;
        for (int i = 1; i < tamanhoCPF; i++) {
            try {
                int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
                if (n != digito) {
                    iguais = false;
                    i = tamanhoCPF;
                }
            } catch (NumberFormatException ex) {
                return false;
            }
        }

        if (iguais) {
            return false;
        }
        for (int i = 0; i < tamanhoCPF - 2; i++) {
            int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            total += (tamanhoCPF - 1 - i) * digito;
        }

        int resto = (total * 10) % 11 == 10 ? 0 : (total * 10) % 11;
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            return false;
        }
        total = 0;
        for (int i = 0; i < tamanhoCPF - 1; i++) {
            int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            total += (tamanhoCPF - i) * digito;
        }

        resto = (total * 10) % 11 == 10 ? 0 : (total * 10) % 11;
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(10)))) {
            return false;
        }
        return true;
    }

    public boolean saque(double valor) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            geraEntradaExtrato("Saque", valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            this.verificarSaldo();
            return false;
        }
    }

    public void deposito(double valor) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        this.saldo += valor;
        this.geraEntradaExtrato("Depósito", valor);
    }

    public void pix(double valor) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        this.saque(valor);
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        } else if (!destino.aberta) {
            System.out.println("Conta de destino fechada!");
            return;
        }
        if (this.saque(valor)) {
            return;
        }
        atualizaHorario();
//        if (this.horarioAtual.getHours() < 8 || this.horarioAtual.getHours() > 19) {
//            System.out.println("Fora do horário! Transferências só podem ocorrer das 8h às 19h!");
//            verificarHorario();
//            return;
//        }
        destino.deposito(valor);
        this.geraEntradaExtrato(">>Tranferência", valor, destino);
    }

    public void verificarSaldo() {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }

    public void verificarHorario() {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        atualizaHorario();
        System.out.printf("Horario atual: %s\n", formatter.format(this.horarioAtual));
    }

    private void atualizaHorario() {
        this.horarioAtual = new Date();
    }

    public void verificarInformacoes() {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        System.out.printf("Nome: %s\n" +
                        "CPF: %s\n" +
                        "Saldo: %.2f\n" +
                        "Endereço: %s\n" +
                        "Banco: %s\n" +
                        "ID Conta: %s\n",
                this.nome, this.cpf,
                this.saldo, this.endereco, this.banco, this.identificadorConta);
    }

    private void geraEntradaExtrato(String operacao, double valor, ContaBancaria conta) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        atualizaHorario();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        extrato.add(String.format("%s - %s: %.2f, para %s", formatter.format(this.horarioAtual), operacao, valor, conta.nome));
    }

    private void geraEntradaExtrato(String operacao, double valor) {
        atualizaHorario();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        extrato.add(String.format("%s - %s: R$ %.2f", formatter.format(this.horarioAtual), operacao, valor));
    }

    public void verificarExtrato() {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }

        System.out.println("\n=============== Extrato ===============");
        System.out.printf("ID da Conta: %d - Titular: %s\n", this.identificadorConta, this.nome);
        for (int i = 0; i < this.extrato.size(); i++) {
            System.out.println(extrato.get(i));
        }
        System.out.println("=======================================");
    }

    public void alterarEndereco(String novoEndereco) {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }
        if (novoEndereco.length() > 0) {
            this.endereco = novoEndereco;
            System.out.println("Endereço alterado!");
        } else {
            System.out.println("Endereço Inválido");
        }
    }

    public void fechaConta() {
        if (!this.aberta) {
            System.out.println("Conta fechada!");
            return;
        }

        Scanner sc = new Scanner(System.in);

        String sim = "Ss";
        String nao = "Nn";
        String resposta = "";
        do {
            System.out.print("Tem certeza que deseja encerrar sua conta? (S/N) ");
            resposta = sc.nextLine();
            if (!sim.contains(resposta) && !nao.contains(resposta)) {
                System.out.println("Entrada inválida!");
            }
        } while (!sim.contains(resposta) && !nao.contains(resposta));
        if (sim.contains(resposta)) {
            this.aberta = false;
            System.out.println("A conta foi encerrada!");
        }
    }

//    public void menu() {
//        atualizaHorario();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        String horario = formatter.format(this.horarioAtual);
//        Scanner sc = new Scanner(System.in);
//        int opcao = 0;
//        do {
//            System.out.printf("\n===== %s =====\n" +
//                    "%s" +
//                    "1- Saque   2- Depósito   3-Pix\n" +
//                    "4- Transferência  5- Ver Saldo\n" +
//                    "6- Ver Horário    7- Ver Infos\n" +
//                    "8- Extrato 9- Alterar Endereço\n" +
//                    "10- Fechar Conta       0- Sair\n" +
//                    "===================");
//            opcao = sc.nextInt();
//            if (opcao < 0 || opcao > 10) {
//                System.out.println("Entrada inválida!");
//            }
//        } while (opcao != 0);
//    }

}
