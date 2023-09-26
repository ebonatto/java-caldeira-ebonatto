import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = 1 + rand.nextInt(100);
        }

        System.out.printf("Digite um número: ");
        int guess = sc.nextInt();

        boolean contains = false;
        for (int n : integers) {
            if (n == guess) {
                contains = true;
            }
        }
        if (contains) {
            System.out.println("Esse número está no Array!");
        } else {
            System.out.println("Esse número não está no Array!");
        }
    }
}
