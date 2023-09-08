import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um horário");
        System.out.print("Horas: ");
        int horas = Integer.parseInt(sc.next());
        System.out.print("Minutos: ");
        int minutos = Integer.parseInt(sc.next());
        System.out.print("Segundos: ");
        int segundos = Integer.parseInt(sc.next());

        int tempoSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
        int meiaNoiteSegundos = (24 * 60 * 60);

        System.out.printf("\nJá se passaram %d segundos!\nFaltam %d segundos para meia-noite!", tempoSegundos, (meiaNoiteSegundos - tempoSegundos));
    }
}
