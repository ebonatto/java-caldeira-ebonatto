import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0;
        do {
            System.out.print("\nInforme sua idade: ");
            idade = Integer.parseInt(sc.next());
            if (idade <= 0) {
                System.out.println("Idade inválida!");
            }
        } while (idade <= 0);

        double salario = 0;
        do {
            System.out.print("\nInforme seu salário: ");
            salario = Integer.parseInt(sc.next());
            if (salario <= 0) {
                System.out.println("Salário inválido!");
            }
        } while (salario <= 0);


        if (idade >= 18 && salario > 2000.0) {
            System.out.println("Você pode comprar um automóvel!");
        } else {
            System.out.println("Você não pode comprar um automóvel!");
        }
    }
}
