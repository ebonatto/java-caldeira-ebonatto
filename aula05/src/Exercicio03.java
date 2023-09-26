import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        String title;
        String date;
        String description;
        Task task;
        int option;
        do {
            System.out.println("\n1- Adicionar tarefa\n" +
                    "2- Remover tarefa\n" +
                    "3- Ver lista\n" +
                    "0- Sair\n");
            System.out.printf("Escolha uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case (1) -> {
                    sc.nextLine(); // Necessário para "consumir" um \n que sobra do nextInt do option = sc.nextInt();
                    System.out.print("Crie uma tarefa");
                    do {
                        System.out.print("Data: ");
                        date = sc.nextLine();
                    } while (!Task.validDate(date));
                    System.out.print("Titulo: ");
                    title = sc.nextLine();
                    System.out.print("Descrição: ");
                    description = sc.nextLine();
                    task = new Task(title, date, description);
                    if (!task.isEmpty()) {
                        tasks.add(task);
                        System.out.println("Tarefa adicionada!");
                    }
                }
                case (2) -> {
                    removeTask(tasks);
                }
                case (3) -> {
                    showList(tasks);
                }


            }
            if (option < 0 || option > 3) {
                System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }



    public static boolean showList(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        System.out.println("===== Tarefas =====");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, list.get(i));
        }
        System.out.println("===================");
        return true;
    }

    public static void removeTask(List<String> list) {
        int task = -1;
        if (showList(list)) {
            do {
                System.out.print("Qual tarefa quer remover? (0 para sair) ");
                task = sc.nextInt();
                if (task != 0) {
                    try {
                        list.remove(task - 1);
                        System.out.println("Tarefa removida!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Tarefa inválida");
                    }
                }
            } while (task != 0 && !list.isEmpty());
        }
    }


}
