package org.example;

public class Calculadora {

    public double adicao(double n1, double n2) {
        return round(n1 + n2);
    }

    public double subtracao(double n1, double n2) {
        return round(n1 - n2);
    }

    public double multiplicacao(double n1, double n2) {
        return round(n1 * n2);
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisao por zero!");
        }
        return round(n1 / n2);
    }

    public double raizQuadrada(double n) {
        if (n < 0) {
            throw new ArithmeticException("Raiz de numero negativo!");
        }
        return round(Math.sqrt(n));
    }

    public double potencia(double n, int potencia) {
        double resultado = n;
        for (int i = 1; i < potencia; i++) {
            resultado *= n;
        }
        return round(resultado);
    }

    public double calculaHipoteca(double emprestimo, double juros, int prazo) {
        double totalPgto = emprestimo + (emprestimo * (juros/100));
        int nPagamentos = prazo * 12;
        return round(totalPgto / nPagamentos);
    }

    private double round(double n) {
        return Double.parseDouble(String.format("%.2f", n));
    }


}
