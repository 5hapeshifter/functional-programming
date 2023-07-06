package java9;

import java.util.*;
import java.util.stream.Stream;

public class Java9 {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(4, 2, 1, 4, 5, 2, 1, 1, 2, 1, 3, 5, 2, 1);
        System.out.println(
                numbers
                        //.takeWhile(i -> i < 5) // takeWhile pega os numeros ate que o proximo numero nao atenda a condicao, se tiver mais dados depois, eles nao serao analisados
                        //.filter(i -> i < 5)
                        .dropWhile(i -> i < 5) // dropWhile funciona igual ao takeWhile, se tiver mais dados depois, eles nao serao analisados
                        .toList()
        );
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, null); // Forma de criar uma lista imutavel, nao pode adicionar nem remover
        //List<Integer> list2 = List.of(1, 2, 3, 4); // Forma de criar uma lista imutavel, nao pode adicionar nem remover
        Set<String> set = Set.of("ab", "bc", "cd"); // set imutavel
        //list1.add(6);
        //list1.remove(2);
        //set.remove("ddd");
        Map<Integer, String> map = Map.of(1, "suleiman", 2, "samir");
//        map.put(3, "sonia");
        map.remove(2);

    }
}
