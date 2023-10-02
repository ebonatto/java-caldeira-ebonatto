import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero n1 = new Numero(0);
        Numero n2 = new Numero(0);
        boolean valid = false;
        String op;

        do {
            try {
                System.out.print("Digite o primeiro número: ");
                n1.valor = (sc.nextInt());
                System.out.print("Digite o segundo número: ");
                n2.valor = (sc.nextInt());
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro!");
                sc.nextLine();
            }
        } while (!valid);

        valid = false;
        sc.nextLine();
        do {
            try {
                System.out.print("\nQual operação deseja realizar +, -, *, /? (S para sair) ");
                op = sc.nextLine().toUpperCase();
                switch (op) {
                    case ("+") -> System.out.printf("%.0f %s %.0f = %.2f",n1.valor, op, n2.valor, n1.operacao(Operacoes.SOMA, n2));
                    case ("-") -> System.out.printf("%.0f %s %.0f = %.2f",n1.valor, op, n2.valor, n1.operacao(Operacoes.SUBTRACAO, n2));
                    case ("*") -> System.out.printf("%.0f %s %.0f = %.2f",n1.valor, op, n2.valor, n1.operacao(Operacoes.MULTIPLICACAO, n2));
                    case ("/") -> System.out.printf("%.0f %s %.0f = %.2f",n1.valor, op, n2.valor, n1.operacao(Operacoes.DIVISAO, n2));
                    case ("S") -> {
                        System.out.println("Saindo...");
                        valid = true;
                    }
                    default -> throw new InvalidOperationException("Operação inválida!");
                }
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            } catch (InvalidOperationException ioe) {
                System.out.println(ioe.getMessage());
                System.out.println("Digite uma operação válida!");
            }
        } while (!valid);
        sc.close();

    }
}