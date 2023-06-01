package lambda;

// SAM - single abstract method - uma interface abstrata sempre tera SOMENTE um metodo abstrato
@FunctionalInterface
public interface GreetingService {

    String greet(String firstName);

}
