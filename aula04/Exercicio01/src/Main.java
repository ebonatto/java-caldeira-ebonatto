public class Main {
    public static void main(String[] args) {
        System.out.println("Aula 3 Exercicio 1\n");

        Veiculo carro = new Carro("Honda", "Civic", 1998);
        Veiculo moto = new Moto("Yahama", "MT-03", 2022);

        System.out.printf("Viagem até Capão da Canoa de carro: R$%.2f\n",
                carro.calcularCustoViagem(138));

        System.out.printf("Viagem até Capão da Canoa de moto: R$%.2f\n",
                moto.calcularCustoViagem(138));
    }
}