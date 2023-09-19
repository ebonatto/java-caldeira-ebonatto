import static java.lang.String.format;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        definirRaio(raio);
    }

    public boolean definirRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
            return true;
        } else {
            System.out.println("Raio inválido!");
            return false;
        }
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }
    @Override
    public String toString() {
        return format("Circulo de raio %.2f\n" +
                "Área: %.2f", raio ,this.calcularArea());
    }

}
