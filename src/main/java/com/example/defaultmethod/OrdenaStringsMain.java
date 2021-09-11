package com.example.defaultmethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsMain {
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

        /**
         * Substituindo Collections.sort por default List.sort()
         */
        comodosDaCasa.sort(new ComparadorDeComodos());


        System.out.println(comodosDaCasa);

        /**
         * Substituindo foreach (for(obj : objs)) por forEach de Iterator
         */
        comodosDaCasa.forEach(new ComodoConsumer());

        /**
         * testando implementação de default method
         */
        DefaultMethodTest dm = new DefaultMethodTest() {};
        dm.print("Nova mensagem");
    }

    private static class ComparadorDeComodos implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() < o2.length())
                return -1;
            if(o1.length() > o2.length())
                return 1;
            return 0;
        }
    }

    private static class ComodoConsumer implements Consumer<String> {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }
}
