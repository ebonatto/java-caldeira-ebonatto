import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the first number?");
        int firstNumber = Integer.parseInt(sc.next());
        System.out.println("What's the second number?");
        int secondNumber = Integer.parseInt(sc.next());
        System.out.printf("Your numbers: %d & %d!", firstNumber, secondNumber);
    }
}
