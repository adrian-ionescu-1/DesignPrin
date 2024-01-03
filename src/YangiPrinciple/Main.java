package YangiPrinciple;

import java.util.List;

//YANGI - You Aren't Gonna Need It
public class Main {
    public static void main(String[] args) {
        List<String> elements = List.of("el1", "el2", "el3", "el4", "el5");

        System.out.println(contains(elements, "el3"));
        System.out.println(contains(elements, "el1"));
        System.out.println(contains(elements, "el7"));

        System.out.println(elements.contains("el3"));
        System.out.println(elements.contains("el1"));
        System.out.println(elements.contains("el7"));
    }

    // YANGI
    public static boolean contains(List<String> list, String el) {
        for (var listElement : list) {
            if (listElement.equals(el)) {
                return true;
            }
        }
        return false;
    }
}
