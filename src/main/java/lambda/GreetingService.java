package lambda;

// SAM - single abstract method - uma interface abstrata sempre tera SOMENTE um metodo abstrato
@FunctionalInterface
public interface GreetingService {

    void greet(String firstName, String lastName, int age);

}
