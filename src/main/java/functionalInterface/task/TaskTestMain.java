package functionalInterface.task;

import java.util.function.Supplier;

public class TaskTestMain {

    public static void main(String[] args) {

        String exp1 = "5 + 2 - 3 * 7 + 2 / 3";
        String exp2 = "10 / 2 * 3 - 3 / 3 * 5";
        String exp3 = "9 * 9 - 1 * 7 / 8 + 30";
        String exp4 = "9 * 9 - 1 * 7 / 8 + 30 ^ 2";

        Calculator.addOperation("^", (a, b) -> (int) Math.pow(a, b));

        System.out.println(Calculator.calculate(exp1));
        System.out.println(Calculator.calculate(exp2));
        System.out.println(Calculator.calculate(exp3));
        System.out.println(Calculator.calculate(exp4));

    }

}
