import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Contact> phonebook = new TreeMap<>();

        phonebook.put("Bonatto", new Contact("51999120020", "Morro Santana", "Leste"));
        phonebook.put("Artur", new Contact("51989456839", "Navegantes", "Norte"));
        phonebook.put("Jean", new Contact("51985670909", "Navegantes", "Norte"));

        printPhonebook(phonebook);
        printContactsByRegion(phonebook, "Norte");

    }

    public static void printPhonebook(SortedMap<String, Contact> phonebook) {
        for (Map.Entry<String, Contact> contato : phonebook.entrySet()) {
            System.out.printf("Nome: %s\n", contato.getKey());
            System.out.println(contato.getValue());
        }
    }

    public static void printContactsByRegion(SortedMap<String, Contact> phonebook, String region) {
        for (Map.Entry<String, Contact> contact : phonebook.entrySet()) {
            if (contact.getValue().getCityRegion().equals(region)) {
                System.out.printf("Nome: %s\n", contact.getKey());
                System.out.println(contact.getValue());
            }
        }
    }
}