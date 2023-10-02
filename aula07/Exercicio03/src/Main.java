import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        boolean valid = false;

        do {

            try {
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro!");
                sc.nextLine();
            }
        } while (!valid);

        System.out.printf("Seus números são %d e %d.", n1, n2);

    }
}