package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("chocolate", "abacaxi", "morango", "cavalo", "uva", "salsa", "ameixa", "feijão", "pimentão",
                "manga", "cavalo", "maçã", "cachorro", "maracujá", "pera", "amendoim", "amendoim", "café",
                "moranga", "cavalo", "cachorro", "abacaxi", "cachorro", "margarita", "cachorro", "morango",
                "pássaro", "chocolate", "cavalo", "pimentão", "rum", "cachorro", "kiwi", "pássaro", "cachorro",
                "morango", "abacate", "pássaro", "feijão", "morango", "ameixa", "chá", "gato", "chocolate", "kiwi",
                "pássaro", "laranja", "amendoim", "morango");

        // a) Conta o número total de strings na lista
        long totalStrings = words.size();
        System.out.printf("Total de palavras na lista: %d\n", totalStrings);

        // b) Encontra a string mais longa presente na lista
        // Método criando um comparador com arrow function
        /* public final class Optional<T> extends Object -> A container object which may or may not contain a non-null value.
            Optional<String> biggest = words.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length())); */

        // Método usando a classe Comaparator
        // O operador :: em Java é conhecido como o operador de referência a método (method reference operator)
        Optional<String> biggest = words.stream().max(Comparator.comparingInt(String::length));
        System.out.println(biggest.get());

        // c) Conta quantas vezes cada string aparece na lista e exibe a contagem para as 5 strings mais frequentes
        /* Cria um map com palavra(key), vezes que palavra aparece(value).
        > Collectors.groupingBy(s -> s, Collectors.counting())
             >> s -> s: Agrupa os elementos pelo valor da função lamba(->), nesse caso as strings iguais são agrupadas juntas
             >> Collectors.counting(): o counting vai ser aplicado em cada grupo formado pelo groupingBy, nesse caso contando
             quantas vezes cada string aparece na lista */
        Map<String, Long> occurrencesWords = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        /* Cria uma lista ordenada de forma decrescente pela quantidade de vezes que as string aparecem
        > .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            >> Cria um comparador que se baseia nos valores das entradas do Map
            >> .reversed(): torna a lista decrescente
        */
        List<Map.Entry<String,Long>> orderedList = occurrencesWords.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).toList();
        for (int i = 0; i < 5; i++) {
            Map.Entry<String,Long> word = orderedList.get(i);
            System.out.printf("%dº- %s: %d\n", i+1, word.getKey(), word.getValue());
        }
    }

}
