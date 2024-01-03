package KissPrinciple;

import java.util.List;

//KISS - Keep It Simple Stupid
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

    public static boolean contains(List<String> list, String el) {
        for (var listElement : list) {
            if (listElement.equals(el)) {
                return true;
            }
        }
        return false;
    }

    //KISS
    public static boolean containsWithWhile(List<String> list, String el) {
        int index = 0;
        boolean result = false;
        while (index < list.size()) {
            if (list.get(index).equals(el)) {
                result = true;
                break;
            }
            index++;
        }
        return result;
    }
}
