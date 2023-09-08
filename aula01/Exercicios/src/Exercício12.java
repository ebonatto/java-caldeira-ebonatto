import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Dólar");
        double dolar = 0;
        do {
            System.out.print("\nDigite a quantia em dólares: ");
            dolar = Double.parseDouble(sc.next());
            if (dolar < 0) {
                System.out.println("Valor inválido!");
            }
        } while (dolar < 0);

        double taxaCambio = 1;
        do {
            System.out.print("\nDigite a taxa de cambio atual: ");
            taxaCambio = Double.parseDouble(sc.next());
            if (taxaCambio <= 0) {
                System.out.println("Taxa inválida!");
            }
        } while (taxaCambio <= 0);

        System.out.printf("Valor converido: $%.2f", (dolar * taxaCambio));
    }
}
