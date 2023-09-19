public class Moto extends Veiculo{
    @Override
    public double calcularCustoViagem(int distancia) {
        return 0.15*distancia;
    }
}
