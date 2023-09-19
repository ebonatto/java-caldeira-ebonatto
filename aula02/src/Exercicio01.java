import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInicial = 0;
        int nFinal = 0;
        do {
            System.out.println("Digite o intervalo desejado para saber os números primos:");
            System.out.print("Número inicial do intervalo: ");
            nInicial = sc.nextInt();
            System.out.print("\nNúmero final do intervalo: ");
            nFinal = sc.nextInt() + 1;

            if (nInicial < 1 || nFinal < 1) {
                System.out.println("Digite números inteiros positivos!");
            } else if (nInicial > nFinal) {
                System.out.println("Número inicial deve ser menor que o final!");
            }
        } while (nInicial < 1 || nFinal < 1 || nInicial > nFinal);

        List<Integer> listaPrimos = new ArrayList<Integer>();

        System.out.println("Números primos:");
        boolean primo = false;
        for (int n = nInicial; n < nFinal; n++) {
            primo = true;
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    primo = false;
                    break;
                }
            }
            if(primo && n != 1) {
                listaPrimos.add(n);
            }
        }

        for (int i = 0; i < listaPrimos.size(); i++) {

            if (i != listaPrimos.size() - 1) {
                System.out.printf("%d, ", listaPrimos.get(i));
            } else {
                System.out.printf("%d\n", listaPrimos.get(i));
            }
        }
        sc.close();
    }
}
