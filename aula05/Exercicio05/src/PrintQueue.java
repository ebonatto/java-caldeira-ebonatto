import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrintQueue {
    private LinkedList<Print> prints = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        int option;
        do {
            System.out.println("\n1- Adicionar impressão\n" +
                    "2- Remover impressão\n" +
                    "3- Ver fila\n" +
                    "4- Imprimir fila\n" +
                    "0- Sair\n");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine(); // Necessário para "consumir" um \n que sobra do nextInt do option = sc.nextInt();
            switch (option) {
                case (1) -> this.addPrint();
                case (2) -> this.removePrint();
                case (3) -> this.showList();
                case (4) -> this.printQueue();
                case (0) -> {
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }

    private void addPrint() {
        prints.add(createPrint());
    }

    private Print createPrint() {
        String name;
        int pages = 0;

        System.out.println("Crie uma impressão");
        System.out.print("Nome: ");
        name = sc.nextLine();
        do {
            System.out.print("Número de páginas: ");
            pages = sc.nextInt();
        } while (pages < 0);
        return new Print(name, pages);
    }

    private void removePrint() {
        int print = -1;
        if (this.showList()) {
            do {
                System.out.print("Qual impressão quer remover? (0 para sair) ");
                print = sc.nextInt();
                if (print != 0) {
                    try {
                        this.prints.remove(print - 1);
                        System.out.println("Impressão removida!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Impressão inválida!");
                    }
                }
            } while (print != 0 && !this.prints.isEmpty());
        }
    }

    private boolean showList() {
        if (this.prints.isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        System.out.println("===== Lista de impressões =====");
        for (int i = 0; i < this.prints.size(); i++) {
            System.out.printf("%d // %s - Nº de páginas: %d\n", i + 1, this.prints.get(i).getName(), this.prints.get(i).getPages());
        }
        System.out.println("============================");
        return true;
    }

    private void printQueue() {
        System.out.println("Imprimindo...");
        System.out.println("Lista impressa!");
        prints.clear();
    }

}
