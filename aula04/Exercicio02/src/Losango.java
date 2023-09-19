import static java.lang.String.format;

public class Losango extends FormaGeometrica{
    public double diagonalMaior;
    public double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior*diagonalMenor)/2;
    }

    @Override
    public String toString() {
        return format("Losango: D = %.2f / d = %.2f\n" +
                "Área: %.2f", diagonalMaior,diagonalMenor,this.calcularArea());
    }
}
