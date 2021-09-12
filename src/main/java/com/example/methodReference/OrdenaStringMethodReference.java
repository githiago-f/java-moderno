package com.example.methodReference;

import com.example.lambda.FunctionalITest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class OrdenaStringMethodReference {
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
         * 3. Substituindo função por integer.compare
         */
        Function<String, Integer> byLength = String::length;
        comodosDaCasa.sort(comparing(byLength));

        /*
         * 1. Substituindo foreach (for(obj : objs)) por forEach de Iterator
         * 2. Substituindo ComodoConsumer por Consumer<String>
         * 3. Substituindo Consumer<String> por lambda
         * 4. Substituindo lambda por referencia do metodo
         */
        comodosDaCasa.forEach(System.out::println);

        FunctionalITest.sayHello();

        FunctionalITest test = System.out::println;

        test.printAll();
        test.print("Testando");
    }
}
