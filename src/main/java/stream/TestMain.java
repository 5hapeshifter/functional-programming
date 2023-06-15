package stream;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
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

        list.stream()
                .filter(i -> {
                    System.out.println("filter-received :: " + i);
                    return i % 2 == 0;
                        })
                .limit(3)
                .map(i -> {
                    System.out.println("map-received :: " + i);
                    return i * i;
                })
                .forEach(System.out::println);

    }
}
