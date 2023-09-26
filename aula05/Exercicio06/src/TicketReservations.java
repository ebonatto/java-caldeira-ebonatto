import java.util.LinkedList;
import java.util.Scanner;

public class TicketReservations {
    private LinkedList<Reservation> reservations = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        int option;
        do {
            System.out.println("\n1- Adicionar reserva\n" +
                    "2- Cancelar reserva\n" +
                    "3- Ver reservas\n" +
                    "0- Sair\n");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine(); // Necessário para "consumir" um \n que sobra do nextInt do option = sc.nextInt();
            switch (option) {
                case (1) -> this.addReservation();
                case (2) -> this.removeReservation();
                case (3) -> this.showList();
                case (0) -> {
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }

    private void addReservation() {
        reservations.add(createReservation());
    }

    private Reservation createReservation() {
        String name;
        String place;
        String cpf;
        String entryDate;
        String exitDate;

        System.out.println("Crie uma reserva");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Lugar: ");
        place = sc.nextLine();
        do {
            System.out.print("CPF: ");
            cpf = sc.nextLine();
        } while (!Reservation.validaCPF(cpf));
        do {
            System.out.print("Data de chegada: ");
            entryDate = sc.nextLine();
        } while (!Reservation.validDate(entryDate));
        do {
            System.out.print("Data de saída: ");
            exitDate = sc.nextLine();
        } while (!Reservation.validDate(exitDate));
        return new Reservation(name, place, cpf, entryDate, exitDate);
    }

    private void removeReservation() {
        int reservation = -1;
        if (this.showList()) {
            do {
                System.out.print("Qual impressão quer remover? (0 para sair) ");
                reservation = sc.nextInt();
                if (reservation != 0) {
                    try {
                        this.reservations.remove(reservation - 1);
                        System.out.println("Reserva removida!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Reserva inválida!");
                    }
                }
            } while (reservation != 0 && !this.reservations.isEmpty());
        }
    }

    private boolean showList() {
        if (this.reservations.isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        System.out.println("=========== Reservas ===========");
        for (int i = 0; i < this.reservations.size(); i++) {
            System.out.printf("%d // %s - Local: %s - CPF: %s\n" +
                    "\t\t-> Data chegada: %s\n" +
                    "\t\t-> Data saida: %s\n", i + 1,
                    this.reservations.get(i).getName(), this.reservations.get(i).getPlace(),
                    this.reservations.get(i).getCpf(), this.reservations.get(i).getEntryDate(),
                    this.reservations.get(i).getExitDate());
        }
        System.out.println("================================");
        return true;
    }
}
