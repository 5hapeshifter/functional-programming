package functionalInterface.runnable;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

public class TestMain {

    public static void main(String[] args) {

        Runnable r = () -> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hello world");
        };

        // Create new thread
        new Thread(r).start();

        r.run();

        System.out.println("Teste");


    }
}
