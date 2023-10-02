import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invalid = false;
        do {
            invalid = false;
            System.out.print("Digite um dia da semana: ");
            String day = sc.nextLine().toUpperCase();

            switch (day) {
                case ("SEGUNDA") -> System.out.println("Hoje é " + DiaDaSemana.SEGUNDA + "!");
                case ("TERCA") -> System.out.println("Hoje é " + DiaDaSemana.TERCA + "!");
                case ("QUARTA") -> System.out.println("Hoje é " + DiaDaSemana.QUARTA + "!");
                case ("QUINTA") -> System.out.println("Hoje é " + DiaDaSemana.QUINTA + "!");
                case ("SEXTA") -> System.out.println("Hoje é " + DiaDaSemana.SEXTA + "!");
                case ("SABADO") -> System.out.println("Hoje é " + DiaDaSemana.SABADO + "!");
                case ("DOMINGO") -> System.out.println("Hoje é " + DiaDaSemana.DOMINGO + "!");
                default -> invalid = true;
            }
            if (invalid) {
                System.out.println("Entrada inválida!");
            }
        } while (invalid);
    }
}