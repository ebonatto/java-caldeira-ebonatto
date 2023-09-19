import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        int midStr = str.length() / 2;

        String str1 = str.substring(0, midStr);
        String str2 = str.substring(midStr);

        System.out.printf("Primeira metade da frase:\n%s", str1);

        sc.close();
    }
}
