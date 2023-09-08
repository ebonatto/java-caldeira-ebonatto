import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = Integer.parseInt(sc.next());
        System.out.print("Informe seu salário: ");
        double salario = Double.parseDouble(sc.next());

        if (idade >= 18 && salario > 2000.0) {
            System.out.println("Você pode comprar um automóvel!");
        } else {
            System.out.println("Você não pode comprar um automóvel!");
        }
    }
}
