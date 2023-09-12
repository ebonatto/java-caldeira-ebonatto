import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = 2023;
        int anoNascimento = 0;
        do {
            System.out.print("\nEm que ano você nasceu? ");
            anoNascimento = Integer.parseInt(sc.next());
            if (anoNascimento <= 0 || anoNascimento > anoAtual) {
                System.out.println("Ano inválido!");
            }
        } while (anoNascimento <= 0 || anoNascimento > anoAtual);

        System.out.printf("Você tem %d anos!", (anoAtual - anoNascimento));
    }
}
