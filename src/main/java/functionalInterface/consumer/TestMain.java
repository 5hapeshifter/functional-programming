package functionalInterface.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("vinoth");
        list.add("selva");
        list.add("ending...");

        /*
         Consumer aceita qualquer valor mas não retorna nada
         */
        Consumer<String> c1 = System.out::println;
        // ForEach accepts consumer as an argument
        //list.forEach(c1);
        list.forEach(s -> System.out.println(s.toUpperCase()));

        Consumer<String> dbConsumer = (s) -> {
            System.out.println("I am writing into DB :: " + s);
        };

        Consumer<String> loggingConsumer = (s) -> {
            System.out.println("I am writing into log file :: " + s);
        };

        Consumer<String> endingConsumer = (s) -> {
            System.out.println("Finally..." + s);
        };

        // Encadeamento de Consumer - para encadear os consumers eles devem ser do mesmo tipo e sempre utilizarao a mesma referencia do objeto manipulado.
        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer).andThen(endingConsumer);
        dbLogConsumer.accept("Suleiman");

//        Map<String, Consumer<String>> map = new HashMap<>();
//        map.put("db", dbConsumer);
//        map.put("log", loggingConsumer);
//        map.put("dblog", dbLogConsumer);
//
//        list.forEach(dbLogConsumer);
//
//        // BiConsumer - Espera dois parametros
//        BiConsumer<String, Integer> biConsumer = (s, i) -> {
//            System.out.println("My name :: " + s);
//            System.out.println("My name :: " + i);
//        };
//        biConsumer.accept("Udemy", 10);
//
//        map.forEach((k, v) -> {
//            System.out.println("Key is :: " + k);
//            System.out.println("Value is :: " + v.getClass());
//        });



    }
}
