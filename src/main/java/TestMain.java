import lambda.GreetingService;
import polymorphism.Dog;

public class TestMain {

    public static void main(String[] args) {

        int a = 5;
        Dog d = new Dog();

        // implementacao da interface com classe anonima
        GreetingService hiService = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hi..." + name);
            }
        };
        hiService.greet("Suleiman");

        // implementacao da interface com lambda, A INTERFACE SO MODE TER UM METODO ABSTRATO
        GreetingService helloService = (name) -> System.out.println("Hello..." + name);
        helloService.greet("Suleiman");


    }
}
