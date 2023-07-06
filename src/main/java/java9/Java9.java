package java9;

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


    }


}
