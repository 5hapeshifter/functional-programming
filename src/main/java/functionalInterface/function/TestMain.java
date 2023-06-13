package functionalInterface.function;

import org.openqa.selenium.json.JsonOutput;

import java.util.function.Function;

public class TestMain {

    public static void main(String[] args) {

//        Function<String, Integer> strLen = (s) -> s.length();
//        Function<Integer, Integer> square = (i) -> i * i;
//
//        System.out.println(
//             //20*20 - para encadear uma função com outra, o resultado da primeira deve ser igual ao parametro aceito pela segunda
//             strLen.andThen(square).apply("hi hello how are you")
//        );

        Function<Integer, Integer> plus2 = (s) -> s + 2;
        Function<Integer, Integer> square = (i) -> i * i;

        System.out.println(
                //66                        //64
                // Quando usamos o metodo .compose(), ele sera executado antes do primeiro metodo
                // andthen a.andthen(b) => a -> b
                // compose a.compose(b) => b -> a
                plus2.compose(square).apply(8)
        );

    }
}
