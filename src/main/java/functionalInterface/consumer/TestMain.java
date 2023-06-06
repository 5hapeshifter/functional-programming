package functionalInterface.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        // Encadeamento de Consumer
        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer);

        Map<String, Consumer<String>> map = new HashMap<>();
        map.put("db", dbConsumer);
        map.put("log", loggingConsumer);
        map.put("dblog", dbLogConsumer);

        list.forEach(dbLogConsumer);



    }
}
