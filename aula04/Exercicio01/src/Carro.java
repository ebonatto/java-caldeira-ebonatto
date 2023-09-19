public class Carro extends Veiculo {
    @Override
    public double calcularCustoViagem(int distancia) {
        return 0.20*distancia;
    }
}
