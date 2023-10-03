package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("chocolate", "abacaxi", "morango", "cavalo", "uva", "salsa", "ameixa", "feijão", "pimentão",
                "manga", "cavalo", "maçã", "cachorro", "maracujá", "pera", "amendoim", "amendoim", "café",
                "moranga", "cavalo", "cachorro", "abacaxi", "cachorro", "margarita", "cachorro", "morango",
                "pássaro", "chocolate", "cavalo", "pimentão", "rum", "cachorro", "kiwi", "pássaro", "cachorro",
                "morango", "abacate", "pássaro", "feijão", "morango", "ameixa", "chá", "gato", "chocolate", "kiwi",
                "pássaro", "laranja", "amendoim", "morango");
        long totalStrings = words.size();
        String biggest = Arrays.stream(words.stream()).max((str1, str2) -> Integer.compare(str1.length(), str2.length()));



    }
}