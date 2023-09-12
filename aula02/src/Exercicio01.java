import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o intervalo desejado para saber os números primos:");
        System.out.print("Número inicial do intervalo: ");
        int nInicial = sc.nextInt();
        System.out.print("\nNúmero final do intervalo: ");
        int nFinal = sc.nextInt() + 1;

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
    }
}
