import lambda.GreetingService;
import polymorphism.Dog;

public class TestMain {

    public static void main(String[] args) {

        int a = 5;
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
        GreetingService helloService = (fn, ln, age) -> {
            System.out.println("my name :: " + fn + " " + ln);
            System.out.println("my age :: " + age);
        };
        helloService.greet("Suleiman", "Diverio", 35);


    }
}
