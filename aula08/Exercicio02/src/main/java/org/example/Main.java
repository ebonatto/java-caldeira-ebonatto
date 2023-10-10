package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = Arrays.asList(
                new Produto("Copo", 2.5, 12),
                new Produto("Caneca", 4.0, 8),
                new Produto("Garrafa de Agua", 5.99, 20),
                new Produto("Prato", 3.75, 15),
                new Produto("Talheres (conjunto de 4)", 6.99, 10),
                new Produto("Guarda-chuva", 12.5, 5),
                new Produto("Toalha de Banho", 8.25, 14),
                new Produto("Fronha", 1.99, 30),
                new Produto("Sabonete", 1.0, 50),
                new Produto("Shampoo", 5.49, 18)
        );

        // a) Encontre o produto mais caro na lista
        Optional<Produto> prodMaisCaro = listaDeProdutos.stream().max(Comparator.comparingDouble(Produto::getPreco));
        System.out.println(prodMaisCaro.get());

        // b) Calcule o preço total de todos os produtos na lista
        /*  > .mapToDouble(produto -> produto.getPreco() * produto.getQuantidade()): gera uma stream com os resultados da função lambda
            > .sum(): soma todos os elementos da stream     */
        Double totalProdutos = listaDeProdutos.stream()
                .mapToDouble(produto -> produto.getPreco() * produto.getQuantidade())
                .sum();
        System.out.printf("Valor total dos produtos: R$ %.2f\n", totalProdutos);

        // c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles
        List<Produto> maisQueDez = listaDeProdutos.stream().filter(produto -> produto.getQuantidade() > 10).toList();
        System.out.println("Produtos com mais de 10 unidades:");
        for (Produto produto : maisQueDez) {
            System.out.println("* " + produto);
        }
    }
}