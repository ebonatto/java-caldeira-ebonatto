import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import javax.swing.plaf.synth.SynthTreeUI;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Book> bookStack = new Stack<>();

        // Adicionando livros na stack
        bookStack.push(new Book("Harry Potter", "Ficção"));
        bookStack.push(new Book("Chaos", "Crime"));
        bookStack.push(new Book("O Alquimista", "Drama"));
        bookStack.push(new Book("Senhor dos anéis", "Ficção"));

        // Imprime toda stack com toString()
        System.out.println(bookStack);

        // Imprime toda stack com printBookStack()
        printBookStack(bookStack);

        // Imprime os livros com a categoria indicada usando printBookStackByGenre()
        printBookStackByGenre(bookStack, "Ficção");

        System.out.println("Esvaziando a Stack...");
        while (!bookStack.empty()) {
            Book removed = bookStack.pop();
            System.out.printf("Livro %s removido!\n", removed.getTitle());
        }

        // Stack está vazia!
        System.out.println(bookStack);
    }

    public static void printBookStack(Stack<Book> bookStack) {
        for (Book book : bookStack) {
            System.out.println(book);
        }
    }

    public static void printBookStackByGenre(Stack<Book> bookStack, String genre) {
        System.out.printf("\n===== %s =====\n", genre);
        for (Book book : bookStack) {
            if (Objects.equals(book.getGenre(), genre)) {
                System.out.println(book);
            }
        }
    }
}