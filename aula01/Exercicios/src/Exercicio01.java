import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Create the scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        // Get text typed on the terminal
        String name = sc.next();
        System.out.printf("Hello %s!", name);
    }
}
