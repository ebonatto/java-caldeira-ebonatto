import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        int option;
        do {
            System.out.println("\n1- Adicionar tarefa\n" +
                    "2- Remover tarefa\n" +
                    "3- Ver lista\n" +
                    "0- Sair\n");
            System.out.printf("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine(); // Necessário para "consumir" um \n que sobra do nextInt do option = sc.nextInt();
            switch (option) {
                case (1) -> this.addTask();
                case (2) -> this.removeTask();
                case (3) -> this.showList();
                case (0) -> {
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }

    private void addTask() {
        tasks.add(createTask());
    }

    private Task createTask() {
        String title;
        String date;
        String description;

        System.out.println("Crie uma tarefa");
        do {
            System.out.print("Data: ");
            date = sc.nextLine();
        } while (!Task.validDate(date));
        System.out.print("Titulo: ");
        title = sc.nextLine();
        System.out.print("Descrição: ");
        description = sc.nextLine();
        return new Task(title, date, description);
    }

    private void removeTask() {
        int task = -1;
        if (this.showList()) {
            do {
                System.out.print("Qual tarefa quer remover? (0 para sair) ");
                task = sc.nextInt();
                if (task != 0) {
                    try {
                        this.tasks.remove(task - 1);
                        System.out.println("Tarefa removida!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Tarefa inválida");
                    }
                }
            } while (task != 0 && !this.tasks.isEmpty());
        }
    }

    private boolean showList() {
        if (this.tasks.isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        System.out.println("===== Tarefas =====");
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.printf("%d // %s - %s:\n\t\t-> %s\n", i + 1, this.tasks.get(i).date, this.tasks.get(i).getTitle(), this.tasks.get(i).getDescription());
        }
        System.out.println("===================");
        return true;
    }
}
