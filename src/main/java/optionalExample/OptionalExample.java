package optionalExample;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {

    public static void main(String[] args) {

        String a = "Ball";
        String b = "Delta";
        String c = "Apple";

        Optional<String> smallest = getSmallest(a, b, c);

        if (smallest.isPresent()) {
            System.out.println(smallest.get());
        } else {
            System.out.println("No value found.");
        }


    }

    // Quando existir a chance de algo retornar nulo, DEVEMOS usar Optional para evitar NullPointerException
    private static Optional<String> getSmallest(String var1, String var2, String var3) {

        return Stream.of(var1, var2, var3)
                .min(Comparator.naturalOrder());

    }
}
