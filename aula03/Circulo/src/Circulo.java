public class Circulo {
    private double raio;
    private double x = 0;
    private double y = 0;

    public Circulo(double raio) {
        definirRaio(raio);
    }

    public Circulo(double x, double y, double raio) {
        if (definirRaio(raio)) {
            this.x = x;
            this.y = y;
        }
    }

    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * this.raio;
    }

    public double calcularDiametro() {
        return 2*this.raio;
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
    public String toString() {
        return String.format("Raio = %.5f  /  Area = %.5f  /  Circunferencia = %.5f",
                this.raio, this.calcularArea(), this.calcularCircunferencia());
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto comparado é da msm classe e se é nulo
        if(obj == null) {
            return false;
        }
        // Verifica se o objeto é ele mesmo
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circulo)) {
            return false;
        }
        Circulo circ = (Circulo) obj;

        return raio == circ.raio;
    }
}
