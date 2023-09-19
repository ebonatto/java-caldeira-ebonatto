import static java.lang.String.format;

public class Triangulo extends FormaGeometrica{
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return format("Triangulo: Base = %.2f / Altura = %.2f\n" +
                "Área: %.2f", base, altura,this.calcularArea());
    }
}
