package FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class _BinaryOperator {
    public static void main(String[] args) {
        System.out.println(sumOperator.apply(10, 10));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static BinaryOperator<Integer> sumOperator = (a, b) -> a + b;
}
