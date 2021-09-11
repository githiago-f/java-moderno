package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenaStringsWLMain {
    public static void main(String[] args) {
        List<String> comodosDaCasa = Arrays.asList(
                "Sala",
                "Cozinha",
                "Banheiro",
                "Quarto da Julia",
                "Quarto do Gabriel",
                "Quarto do Thiago",
                "Escritório"
        );

        /*
         * 1. Substituindo Collections.sort por default List.sort()
         * 2. Substituindo ComparadorDeComodos por Comparator<String>
         */
        comodosDaCasa.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return -1;
                if (o1.length() > o2.length())
                    return 1;
                return 0;
            }
        });

        /*
         * 1. Substituindo foreach (for(obj : objs)) por forEach de Iterator
         * 2. Substituindo ComodoConsumer por Consumer<String>
         * 3. Substituindo Consumer<String> por lambda
         */
        comodosDaCasa.forEach((s) -> System.out.println(s));
    }
}
