import static java.lang.String.format;

public class Quadrado extends FormaGeometrica{
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return format("Quadrado de lado %.2f\n" +
                "Área: %.2f", lado,this.calcularArea());
    }
}
