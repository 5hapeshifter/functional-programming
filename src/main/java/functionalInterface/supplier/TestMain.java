package functionalInterface.supplier;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestMain {

    public static void main(String[] args) {

        // Supplier não recebe argumento, mas retorna um valor
        //Supplier<Double> random = () -> Math.random();
        Supplier<Double> random = Math::random;
        System.out.println(random.get());

    }
}
