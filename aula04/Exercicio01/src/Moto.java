public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return 0.15*distancia;
    }
}
