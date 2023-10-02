import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();

        products.put("Frango", 16.90);
        products.put("Arroz", 7.50);
        products.put("Vassoura", 14.99);

        printProducts(products);

    }

    public static void printProducts(LinkedHashMap<String, Double> products) {
        System.out.println("Produtos:");
        for (Map.Entry<String, Double> product : products.entrySet()) {
            System.out.printf("%s -> R$ %.2f\n", product.getKey(), product.getValue());
        }
    }
}