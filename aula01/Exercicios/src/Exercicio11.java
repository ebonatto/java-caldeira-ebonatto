import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou uma frase: ");
        String frase = sc.nextLine();
        int qtdeVogais = 0;
        String vogais = "AEIOUaeiou";

        for (int i = 0; i < frase.length(); i++) {
            if (vogais.contains(String.valueOf(frase.charAt(i)))) {
                qtdeVogais++;
            }
        }
        System.out.printf("Essa frase tem %d vogais!", qtdeVogais);
    }
}
