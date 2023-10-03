import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        while (age < 0 || age > 150) {
            try {
                System.out.print("Qual sua idade? ");
                age = sc.nextInt();
                if (age < 0 || age > 150) {
                    throw new IdadeInvalidaException("Idade inválida! Digite uma idade maior que 0 e menor que 150.");
                }
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("Digite um número inteiro!");
            } catch (IdadeInvalidaException iie) {
                System.out.println(iie.getMessage());
            }
        }
        System.out.printf("Parabéns pelos %d anos de vida!\n", age);
    }
}