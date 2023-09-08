import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 3 numbers");
        System.out.println("First number:");
        int firstNumber = Integer.parseInt(sc.next());
        System.out.println("Second number:");
        int secondNumber = Integer.parseInt(sc.next());
        System.out.println("Third number:");
        int thirdNumber = Integer.parseInt(sc.next());

        int higherNumber = Integer.max(Integer.max(firstNumber, secondNumber), thirdNumber);
        int lowerNumber = Integer.min(Integer.min(firstNumber, secondNumber), thirdNumber);
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.printf("\nHigher: %d\tLower: %d\tAverage: %.2f", higherNumber, lowerNumber, average);
    }
}
