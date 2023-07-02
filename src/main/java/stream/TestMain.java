package stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
////        list.add(8);
////        list.add(9);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
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
//        System.out.println("starting");
//
//        // verificacao mais complexa
//        Predicate<Integer> evenNumber = (i) -> i % 2 == 0 && i > 5;
//
//        list.stream()
//                // a quantidade de objetos informada no skip sera ignorada
//                //.skip(4)
//                .peek(i -> System.out.println("filter-received :: " + i))
//                .filter(i -> {
//                    //System.out.println("filter-received :: " + i);
//                    return evenNumber.test(i);
//                })
//                //.filter(i -> i > 5) // Podemos adicionar mais de um filter ou map
//                .peek(i -> System.out.println("map-received :: " + i))
//                .map(i ->  i * i)
//                //.map(i -> i + 2) // Podemos adicionar mais de um filter ou map
//                .forEach(System.out::println);
//
//        System.out.println("ending");


        /*
        Flat Map
     */

//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//
//        List<Integer> b = new ArrayList<>();
//        b.add(4);
//        b.add(5);
//        b.add(6);
//
//        List<Integer> c = new ArrayList<>();
//        c.add(7);
//        c.add(8);
//        c.add(9);
//
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.add(c);
//
//        list.stream()
//                .flatMap(l -> l.stream())
//                .map(i -> i * i)
//                .forEach(System.out::println);

        /*
         * Other stream example
         */

//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("ball");
//        list.add("cat");
//        list.add("dog");
//
//        System.out.println(
//                list.stream()
//                        .min(Comparator.naturalOrder())
//                        .filter(s -> s.length() > 3)
//                        .stream()
//                        .noneMatch(s -> s == "apple")
//
//        );

//        /*
//         * Collector toList/toSet, joining example
//         */
//
//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("apple");
//        list.add("Airplane");
//        list.add("ball");
//        list.add("Boy");
//        list.add("cat");
//        list.add("dog");
//        list.add("Delta");
//
//        // a lista original não foi modificada pq collectors.toList cria uma nova lista
//        List<String> newToList = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.toList());
//
//        System.out.println("Original :: " + list);
//        System.out.println("New list :: " + newToList);
//
//        Set<String> newToSet = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.toSet());
//
//        System.out.println("Original :: " + list);
//        System.out.println("New Set list :: " + newToSet);
//
//        // JOINING - concatenando todas Strings da lista
//        String joining = list.stream()
//                .filter(s -> s.length() > 3)
//                //.collect(Collectors.joining());
//                .collect(Collectors.joining(";"));
//
//        System.out.println("Original :: " + joining);

        /*
         * groupingBy, fid first
         */

//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("apple");
//        list.add("Airplane");
//        list.add("ball");
//        list.add("Boy");
//        list.add("cat");
//        list.add("dog");
//        list.add("Delta");
//
//        Map<Integer, List<String>> collect = list.stream()
//                .collect(Collectors.groupingBy(s -> s.length()));
//
//        System.out.println(collect);
//
//        Map<Character, List<String>> collectChar = list.stream()
//                .collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        System.out.println(collectChar);
//
//        Optional<String> first = list.stream().findFirst();
//        System.out.println("First:: " + first);
//
//    /*
//        Parallel aumenta a eficiência de execução pq cria threads que executam processos paralelos, diminuindo o tempo de execucao.
//    */
//
//        Map<Integer, List<String>> parallel = list.stream()
//                .parallel()
//                .collect(Collectors.groupingBy(s -> s.length()));

        /*
         * Reusable stream
         */

//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("apple");
//        list.add("Airplane");
//        list.add("ball");
//        list.add("Boy");
//        list.add("cat");
//        list.add("dog");
//        list.add("Delta");
//
//        Stream<String> stream = list.stream()
//                .filter(s -> s.length() > 3);
//
//        // executando os dois prints abaixo estoura IllegalStateException, pq esta ocorrendo dois processos ao mesmo tempo em uma lista de dados
//        stream.forEach(s -> System.out.println(s));
//        stream.forEach(s -> System.out.println(s.toUpperCase()));

        /*
            Stream source = gerando stream e usando os dados a partir de objetos.
         */
//        String a = "Ball";
//        String b = "Delta";
//        String c = "Apple";
//
//        System.out.println(
//                Stream.of(a, b, c)
//                        .min(Comparator.naturalOrder())
//        );

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,2,3,4,5,6,7,8,9);

        int sum = 0;

//        for (int i : list) {
//            sum = sum + 1;
//        }

//        list.stream() // da erro usando stream dessa forma
//                        .forEach(i -> {
//                            sum = sum + i;
//                        });
        // Método de somar todos elementos de um array - REDUCE
//        Optional<Integer> reduce = list.stream()
//                .reduce((a, b) -> {
//                    // o resultada de cada execucao, eh armazenado na primeira variavel da lambda expression
//                    System.out.println(a + "::" + b);
//                    return a + b;
//                });
//
//        System.out.println(reduce.get());

        // Type primitive stream, o mapToInt transforma em uma IntStream que tem os metodos matematicos de soma, média e etc disponiveis
//        DoubleStream
//        IntStream
        System.out.println(
                list.stream()
                        .mapToInt(a -> a)
                        .mapToLong(a -> a)
//                        .mapToDouble(a -> a)
//                        .boxed() // Converte de IntStream para Stream<Integer>
                        .sum()
        );

    }
}
