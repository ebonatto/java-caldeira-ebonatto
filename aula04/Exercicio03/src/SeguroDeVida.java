public class SeguroDeVida implements Tributavel{
    private double saldo;

    @Override
    public double calculaTributos() {
        return 42;
    }

    @Override
    public String toString() {
        return String.format("Seguro de Vida");
    }
}
