import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Calculadora=====");
        int operacao = 0;
        do {
            System.out.print("=====================\n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicão\n" +
                    "4 - Divisão\n" +
                    "=====================\n");
            System.out.print("Digite a operação: ");
            operacao = sc.nextInt();
            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida!");
            }
        } while (operacao < 1 || operacao > 4);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();


        switch (operacao) {
            case (1) -> System.out.printf("Resultado: %.2f + %.2f = %.2f", n1, n2, n1+n2);
        }
    }
}
