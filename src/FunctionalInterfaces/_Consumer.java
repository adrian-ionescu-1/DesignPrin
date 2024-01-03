package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

// este o interfata functionala care primeste un singur parametru de tip T si nu returneaza nimic, adica void
public class _Consumer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>()
        {{
           add("str1");
            add("str2");
            add("str3");
        }};

//        displayElements(list);

        displayElementsConsumer.accept(list);

        displayElementsBiConsumer.accept(list, 10);

        displayValueConsumer.accept(20);
    }

    public static void displayElements(List<String> list) {
        for (var element : list) {
            System.out.println(element);
        }
    }

    public static Consumer<List<String>> displayElementsConsumer = list -> {
        for (var element : list) {
            System.out.println(element);
        }
    };

    public static BiConsumer<List<String>, Integer> displayElementsBiConsumer = (list, number) -> {
        for (var element : list) {
            System.out.println(element);
        }
        System.out.println("Number is: " + number);
    };

    public static DoubleConsumer displayValueConsumer = (value) -> System.out.println(value);
}
