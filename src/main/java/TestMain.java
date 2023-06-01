import lambda.GreetingService;
import polymorphism.Dog;

public class TestMain {

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
        GreetingService g = (n) -> n.toUpperCase();

        String s = "Suleiman";
        System.out.println(g.greet(s));

        // higher order function -
        // passando a funcao lambda como argumento e definindo o comportamento que queremos, implementado do java 8
        test((n) -> n.toUpperCase() + n.toLowerCase() + n.length());
        test(a -> a.substring(1,3));
        test(b -> b.replace("d", "D"));

        test(n -> n.toLowerCase());
        test(n -> n.toUpperCase());
        test(n -> n.length() + "");


    }

    private static void test(GreetingService g){
        String returnedString = g.greet("udemy");
        System.out.println(returnedString);

    }

    private static void convertToUppercase(String s) {
        String returnedString = s.toUpperCase();
        System.out.println(returnedString);
    }

    private static void convertToLowercase(String s) {
        String returnedString = s.toLowerCase();
        System.out.println(returnedString);
    }
}
