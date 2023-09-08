import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiro = -1;
        do {
            System.out.printf("Digite um número inteiro não negativo (max: 20): ");
            inteiro = Integer.parseInt(sc.next());
            if (inteiro < 0 || inteiro > 20) {
                System.out.println("Número inválido!");
            }
        } while (inteiro < 0 || inteiro > 20);

        int inteiroInicial = inteiro;
        long fatorial = 1;
        while (inteiro > 1) {
            fatorial *= inteiro;
            inteiro--;
        }

        System.out.printf("%d! = %d", inteiroInicial, fatorial);
    }
}
