public class Main {
    public static void main(String[] args) {
        Circulo circ = new Circulo(5);
        Circulo circ1 = new Circulo(5);
        System.out.println(circ.calcularArea());
        System.out.println(circ.calcularCircunferencia());
        System.out.println(circ.equals(circ1));
    }
}