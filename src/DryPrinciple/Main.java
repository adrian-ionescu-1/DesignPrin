package DryPrinciple;

import java.util.ArrayList;
import java.util.List;

//DRY - Don't Repeat Yourself
public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>()
        {{
            add("Element1");
        }};

        names.add("Name1");
        names.add("Name2");
        names.add("Name3");

//        List<String> newNames = new ArrayList<>();
//
//        for(var name : names) {
//            if (name.startsWith("N")) {
//                newNames.add(name);
//            }
//        }

        List<String> newElements = filterNames(names);

        for(String name : newElements) {
            System.out.println(name);
        }

        //
//        for (var name : names) {
//            if (name.startsWith("N")) {
//                newNames.add(name);
//            }
//        }
        List<String> newElements2 = filterNames(names);


        String str1 = "String1";
        int number = 5;
        boolean value = true;

        var str2 = "String2"; //infer type / type inference
        var number2 = 5;
        var value2 = true;
    }

    public static List<String> filterNames(List<String> names) {
        List<String> newElements = new ArrayList<>();
        for (var name : names) {
            if (name.startsWith("N")) {
                newElements.add(name);
            }
        }
        return newElements;
    }


}
