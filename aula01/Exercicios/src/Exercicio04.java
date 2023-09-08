import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1320.00;
        System.out.printf("Salário Mínimo: R$ %.2f\n", salarioMinimo);
        System.out.print("Qual seu salário? ");
        double salarioInput = Double.parseDouble(sc.next());
        double salarioPerc = salarioInput / salarioMinimo;

        System.out.printf("\nVocê ganha %.2f salários mínimos!", salarioPerc);
    }
}
