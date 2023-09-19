import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        System.out.println("Advinhe quantos soldados os espartanos irão enfrentar!");
        do {
            System.out.print("Quantos soldados iremos enfrentar? ");
            guess = sc.nextInt();

            if (guess < 300000) {
                System.out.println("Um pouco mais!");
            } else if (guess > 300000){
                System.out.println("Um pouco menos!");
            }
        } while (guess != 300000);

        System.out.println("Isso mesmo! Vamos para guerra!");
        sc.close();
    }
}
