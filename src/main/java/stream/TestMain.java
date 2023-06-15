package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        list.add(8); //
//        list.add(9);


//        list.stream()
//                /*
//                    Numeros encontrados / numero * numero
//                 */
//                .filter(integer -> integer % 2 == 0)
//                .limit(3)
//                .map(integer -> integer * integer)
//                .forEach(System.out::println);

        // Fluxo de execucao da stream
        System.out.println("starting");

        Predicate<Integer> evenNumber = (i) -> i % 2 == 0;

        list.stream()
                .filter(i -> {
                    System.out.println("filter-received :: " + i);
                    return evenNumber.test(i);
                        })
                //.sorted() // quando usamos o sorted(), todos os dados da lista sao recebidos e ordenados, depois sao repassados a proxima execucao
                .limit(3)
                .sorted()
                .map(i -> {
                    // map eh o unico que pode mudar o valor na pipeline de stream
                    System.out.println("map-received :: " + i);
                    return i * i;
                })
                .forEach(System.out::println);

        System.out.println("ending");
    }
}
