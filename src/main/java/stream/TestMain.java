package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        list.add(8);
//        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);


//        list.stream()
//                /*
//                    Numeros encontrados / numero * numero
//                 */
//                .filter(integer -> integer % 2 == 0)
//                .limit(3)
//                .map(integer -> integer * integer)
//                .forEach(System.out::println);

        // Fluxo de execucao da stream
        /*
            Testando sorted()
         */
//        System.out.println("starting");
//
//        Predicate<Integer> evenNumber = (i) -> i % 2 == 0;
//
//        list.stream()
//                .filter(i -> {
//                    System.out.println("filter-received :: " + i);
//                    return evenNumber.test(i);
//                        })
//                //.sorted() // quando usamos o sorted(), todos os dados da lista sao recebidos e ordenados, depois sao repassados a proxima execucao
//                .limit(3) // Limita os objetos avaliados
//                .sorted()
//                .map(i -> {
//                    // map eh o unico que pode mudar o valor na pipeline de stream
//                    System.out.println("map-received :: " + i);
//                    return i * i;
//                })
//                .forEach(System.out::println);
//
//        System.out.println("ending");


        /*
            Testando peek
         */
//        System.out.println("starting");
//
//        Predicate<Integer> evenNumber = (i) -> i % 2 == 0;
//
//        list.stream()
//                // peek e utilizado para debugar
//                .peek(i -> System.out.println("filter-received :: " + i))
//                .filter(i -> {
//                    //System.out.println("filter-received :: " + i);
//                    return evenNumber.test(i);
//                })
//                .limit(3)
//                .peek(i -> System.out.println("map-received :: " + i))
//                .map(i ->  i * i)
//                .forEach(System.out::println);
//
//        System.out.println("ending");

        /*
            Testando skip
         */
//        System.out.println("starting");
//
//        Predicate<Integer> evenNumber = (i) -> i % 2 == 0;
//
//        list.stream()
//                // a quantidade de objetos informada no skip sera ignorada
//                //.skip(4)
//                .peek(i -> System.out.println("filter-received :: " + i))
//                .filter(i -> {
//                    //System.out.println("filter-received :: " + i);
//                    return evenNumber.test(i);
//                })
//                .limit(3) // 2,4,6
//                .peek(i -> System.out.println("map-received :: " + i))
//                .map(i ->  i * i)
//                .skip(2) // pulou o 2 e 4
//                .forEach(System.out::println);
//
//        System.out.println("ending");


        /*
            Mais sobre filter e map
         */
        System.out.println("starting");

        // verificacao mais complexa
        Predicate<Integer> evenNumber = (i) -> i % 2 == 0 && i > 5;

        list.stream()
                // a quantidade de objetos informada no skip sera ignorada
                //.skip(4)
                .peek(i -> System.out.println("filter-received :: " + i))
                .filter(i -> {
                    //System.out.println("filter-received :: " + i);
                    return evenNumber.test(i);
                })
                //.filter(i -> i > 5) // Podemos adicionar mais de um filter ou map
                .peek(i -> System.out.println("map-received :: " + i))
                .map(i ->  i * i)
                //.map(i -> i + 2) // Podemos adicionar mais de um filter ou map
                .forEach(System.out::println);

        System.out.println("ending");
    }
}
