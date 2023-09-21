import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números inteiros");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        int media = soma / numeros.length;

        System.out.printf("Soma: %d\nMédia: %d\n", soma, media);
    }
}
