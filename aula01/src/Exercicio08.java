import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prioridade = 0;

        do {
            System.out.printf("\n======Prioridade======\n" +
                    "1 - Gestante\n" +
                    "2 - Idoso\n" +
                    "3 - PCD\n" +
                    "4 - Nenhuma das alternativas\n" +
                    "======================\n" +
                    "Digite o número da opção desejada: ");
            prioridade = Integer.parseInt(sc.next());
            if (prioridade < 1 || prioridade > 4) {
                System.out.println("Opção Inválida!");
            }
        } while (prioridade < 1 || prioridade > 4);

        if (prioridade == 4) {
            System.out.printf("Não tem direito a fila prioritária!");
        } else {
            System.out.printf("Tem direito a fila prioritária!");
        }
    }
}
