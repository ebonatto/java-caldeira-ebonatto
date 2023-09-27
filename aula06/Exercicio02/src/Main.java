import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // Adicionando elementos no HashMap
        ages.put("Bonatto", 21);
        ages.put("Fetterman", 17);
        ages.put("Zamit", 21);
        ages.put("Teresa", 73);
        ages.put("José", 82);
        ages.put("Pietro", 6);
        ages.put("Manuela", 1);

        // Imprimindo a idade de nomes específicos
        System.out.println(ages.get("Bonatto"));
        System.out.println(ages.get("Pietro"));
        System.out.println(ages.get("Eduardo"));

        // Imprime nomes das pessoas da terceira idade no HashMap
        printSeniors(ages);

        // Imprime idade de nomes específicos com método criado printAge()
        printAge(ages, "Eduardo");
        printAge(ages, "Zamit");
    }

    public static void printSeniors(HashMap<String, Integer> ages) {
        int n = 0;
        for (Map.Entry<String, Integer> person : ages.entrySet()) {
            if (person.getValue() >= 60) {
                System.out.println(person.getKey());
                n++;
            }
        }
        if (n==0) {
            System.out.println("Lista não possue pessoas da terceira idade!");
        }
    }

    public static void printAge(HashMap<String, Integer> ages, String name) {
        if (ages.containsKey(name)) {
            System.out.println(ages.get(name));
        } else {
            System.out.println("Não está na lista!");
        }
    }

}