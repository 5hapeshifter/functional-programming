import lambda.GreetingService;
import lambda.StringOperations;
import polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        int v = 5;
        Dog d = new Dog();

        // implementacao da interface com classe anonima
//        GreetingService hiService = new GreetingService() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hi..." + name);
//            }
//        };
//        hiService.greet("Suleiman");

        // implementacao da interface com lambda em single line declaration, somente com uma execucao
        //GreetingService helloService = (name) -> System.out.println("Hello..." + name);

        // implementacao com mais de uma linha, para executar mais de uma funcao
//        GreetingService helloService = (fn, ln, age) -> {
//            System.out.println("my name :: " + fn + " " + ln);
//            System.out.println("my age :: " + age);
//        };
//        helloService.greet("Suleiman", "Diverio", 35);

        // retornando valores - nao single line declaration
//        GreetingService g = (firstName) -> {
//            return firstName.toUpperCase();
//        };

        // retornando valores - single line declaration
        // GreetingService h = String::toUpperCase; // method reference
//        GreetingService g = (n) -> n.toUpperCase();
//
//        String s = "Suleiman";
//        System.out.println(g.greet(s));

        // higher order function -
        // passando a funcao lambda como argumento e definindo o comportamento que queremos, implementado do java 8
//        test((n) -> n.toUpperCase() + n.toLowerCase() + n.length());
//        test(a -> a.substring(1,3));
//        test(b -> b.replace("d", "D"));

        // When lambda is executed
//        System.out.println("Starting executtion");
//
//        test(s -> {
//            System.out.println("Inside lambda");
//           return s.toUpperCase();
//           // Result - A ordem nao e comum, pq lambda nao e um metodo implementado, mas sim uma declaracao
//            Starting executtion
//            Inside test method. Receive greeting service
//            Inside lambda
//            UDEMY
//            Ending executtion
//        });
//
//        System.out.println("Ending executtion");

        // Higher order function part 3 - atribuindo uma lambda function a uma variavel e retornando a implementacao por meio do metodo
//        String ss = getLambda().greet("data");
//        System.out.println(ss);

        // Utilizando method reference, não aceita parametro, pois a variavel e atribuida automaticamente ao metodo referenciado
//        StringOperations opl = System.out::println;
//        opl.accept("udemy");
        // Retornando um boolean
//        StringOperations opl = Objects::isNull;
//        System.out.println(opl.accept("sssas"));

//        StringOperations opl = String::toUpperCase;
//        System.out.println(opl.accept("ssas"));;

        // Passando dois parametros com method reference
        // o metodo sera invocado dessa forma ~ (s) -> s1.concat(s2);
//        StringOperations opl = String::concat;
//        System.out.println(opl.accept("ab", "cd"));

        // exemplo de uso com lista
        StringOperations opl = list::add;
        opl.accept("udemy");
        System.out.println(list);

    }

//    private static void test(GreetingService g){
//        System.out.println("Inside test method. Receive greeting service");
//        String returnedString = g.greet("udemy");
//        System.out.println(returnedString);
//
//    }
    private static void test(GreetingService g){
        g.greet("udemy");
        System.out.println("Inside test method. Received greeting service");

    }

    private static GreetingService getLambda() {
        GreetingService g = (s) -> s.toUpperCase();
        return g;
    }


    private static int getNumber() {
        System.out.println("Called getNumber");
        return 5;
    }

    private static void receiveNumber(int i) {
        System.out.println("Receive number is :: " + i);
    }

}
