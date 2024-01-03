package FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

//Function
//Consumer
//Predicate
//Supplier

//toate sunt interfete functionale
//o interfata functionala TREBUIE sa aiba o singura metoda abstracta

public class _Function {
    public static void main(String[] args) {
//        int number = 0;
//        number = incrementByOne(number);
//        System.out.println(number);
//        number = incrementByOne(number);
//        System.out.println(number);

//        int n = 0;
//        n = incrementBy(n, 20);
//        System.out.println(n);

        int number = incrementByOneFunction.apply(10);
        System.out.println(number);

        number = incrementByFunction.apply(number, 20);
        System.out.println(number);
    }

    public static int incrementByOne(int n) {
        return n+1;
    }

    public static int incrementBy(int n, int incrementor) {
        return n+incrementor;
    }

    //T - Type - primit
    //R - Result - result
    //primeste un singur parametru, deci are un singur argument
    public static Function<Integer, Integer> incrementByOneFunction = (number) -> {
        return number + 1;
    };

    public static BiFunction<Integer, Integer, Integer> incrementByFunction = (number, incrementor) -> number + incrementor;
}
