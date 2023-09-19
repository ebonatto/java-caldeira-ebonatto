import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        char[] charArr = str.toCharArray();
        char[] charArrReversed = charArr.clone();
        int j = 0;
        for(int i = charArr.length - 1; i >= 0; i--) {
            charArrReversed[j] = charArr[i];
            j++;
        }

        for (char c : charArrReversed) {
            System.out.print(c);
        }
        sc.close();
    }
}
