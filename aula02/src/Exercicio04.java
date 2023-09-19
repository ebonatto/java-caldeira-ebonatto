import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacao = 0;
        do {
            System.out.println("\n====== Calculadora ======");
            System.out.print("\t1 - Soma\n" +
                    "\t2 - Subtração\n" +
                    "\t3 - Multiplicão\n" +
                    "\t4 - Divisão\n" +
                    "\t0 - Sair\n" +
                    "=========================\n");
            System.out.print("Digite a operação: ");
            operacao = sc.nextInt();

            double n1 = 0;
            double n2 = 0;

            if (operacao != 0) {
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextDouble();
                do {
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    if (operacao == 4 && n2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                    }
                } while (operacao == 4 && n2 == 0);
            }
            switch (operacao) {
                case (1) -> System.out.printf("Resultado: %.2f + %.2f = %.2f", n1, n2, n1 + n2);
                case (2) -> System.out.printf("Resultado: %.2f - %.2f = %.2f", n1, n2, n1 - n2);
                case (3) -> System.out.printf("Resultado: %.2f * %.2f = %.2f", n1, n2, n1 * n2);
                case (4) -> System.out.printf("Resultado: %.2f / %.2f = %.2f", n1, n2, n1 / n2);
                case (0) -> System.out.println("Saindo da calculadora!");
                default -> System.out.println("Opção inválida!");
            }
        } while (operacao != 0);
        sc.close();
    }
}
