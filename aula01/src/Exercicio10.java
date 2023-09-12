import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = Double.parseDouble(sc.next());
        double tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.printf("\nTemperatura em Celsius: %.1fº\n" +
                "Temperatura em Fahrenheit: %.1fº", tempCelsius, tempFahrenheit);
    }
}
