public class Numero implements Calculavel {
    public double valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public double adicionar(Numero n) {
        return this.valor + n.valor;
    }

    @Override
    public double subtrair(Numero n) {
        return this.valor - n.valor;
    }

    @Override
    public double multiplicar(Numero n) {
        return this.valor * n.valor;
    }

    @Override
    public double dividir(Numero n) throws ArithmeticException{
        if (n.valor != 0) {
            return (double) this.valor / n.valor;
        } else {
            throw new ArithmeticException("Divisão por zero!");
        }
    }

    @Override
    public double operacao(Operacoes op, Numero n) {
        switch (op) {
            case SOMA -> {
                return this.adicionar(n);
            }
            case SUBTRACAO -> {
                return this.subtrair(n);
            }
            case MULTIPLICACAO -> {
                return this.multiplicar(n);
            }
            case DIVISAO -> {
                return this.dividir(n);
            }
        }
        return 0;
    }
}
