import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        do {
            System.out.print("\nQual sua idade? ");
            idade = Integer.parseInt(sc.next());
            if (idade <= 0) {
                System.out.println("Idade inválida!");
            }
        } while (idade <= 0);


        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade < 18 || idade > 65) {
            System.out.println("Para você o voto é facultativo!");
        } else {
            System.out.println("Para você o voto é obrigatório!");
        }
    }
}
