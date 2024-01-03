package Exercises3;

import java.util.HashMap;
import java.util.Map;

public class MapPrinter {

    public static void main(String[] args) {
        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("Java", 18);
        exampleMap.put("Python", 1);
        exampleMap.put("PHP", 0);
        exampleMap.put("C++", 10);
        exampleMap.put("JavaScript", 5);

        printMap(exampleMap);
    }

    public static void printMap(Map<String, Integer> inputMap) {
        int size = inputMap.size();
        int count = 0;

        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            System.out.printf("Key: %s, Value: %d%s",
                    entry.getKey(),
                    entry.getValue(),
                    (++count < size) ? ",\n" : ".\n"
            );
        }
    }
}