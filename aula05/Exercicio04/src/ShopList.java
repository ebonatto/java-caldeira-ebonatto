import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopList {
    private List<Item> items = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        int option;
        do {
            System.out.println("\n1- Adicionar item\n" +
                    "2- Remover item\n" +
                    "3- Verificar validade\n" +
                    "4- Ver lista\n" +
                    "0- Sair\n");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine(); // Necessário para "consumir" um \n que sobra do nextInt do option = sc.nextInt();
            switch (option) {
                case (1) -> this.addItem();
                case (2) -> this.removeItem();
                case (3) -> this.verifyExpirated();
                case (4) -> this.showList();
                case (0) -> {
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }

    private void addItem() {
        items.add(createItem());
    }

    private Item createItem() {
        String name;
        String expDate;

        System.out.println("Crie um item");
        System.out.print("Nome: ");
        name = sc.nextLine();
        do {
            System.out.print("Data de validade: ");
            expDate = sc.nextLine();
        } while (!Item.validDate(expDate));
        return new Item(name, expDate);
    }

    private void removeItem() {
        int item = -1;
        if (this.showList()) {
            do {
                System.out.print("Qual item quer remover? (0 para sair) ");
                item = sc.nextInt();
                if (item != 0) {
                    try {
                        this.items.remove(item - 1);
                        System.out.println("Item removido!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Item inválido");
                    }
                }
            } while (item != 0 && !this.items.isEmpty());
        }
    }

    private boolean showList() {
        if (this.items.isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        System.out.println("===== Lista de compras =====");
        for (int i = 0; i < this.items.size(); i++) {
            System.out.printf("%d // %s - Valido até %s\n", i + 1, this.items.get(i).getName(), this.items.get(i).getExpirationDate());
        }
        System.out.println("============================");
        return true;
    }

    private void verifyExpirated() {
        int item = -1;
        String expirated;
        if (this.showList()) {
            do {
                System.out.print("Qual item quer verificar? (0 para sair) ");
                item = sc.nextInt();
                if (item != 0) {
                    try {
                        expirated = this.items.get(item - 1).isExpirated() ? "está vencido" : "não está vencido";
                        System.out.printf("Item %s!\n", expirated);
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Item inválido");
                    } catch (ParseException e) {
                        System.out.println("Data inválida!");
                    }
                }
            } while (item != 0 && !this.items.isEmpty());
        }
    }
}
