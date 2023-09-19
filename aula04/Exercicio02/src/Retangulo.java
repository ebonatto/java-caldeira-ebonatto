import static java.lang.String.format;

public class Retangulo extends FormaGeometrica {
    public double lado1;
    public double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return format("Retangulo %.2f x %.2f\n" +
                "Área: %.2f", lado1,lado2,this.calcularArea());
    }
}
