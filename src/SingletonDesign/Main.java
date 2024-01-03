package SingletonDesign;


import SolidPrinciples.DependencyInversion;
import SolidPrinciples.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String str1 = new String("Str1");
//        String str2 = new String("Str1");

        String str1 = "test";
        String str2 = "test";

//        String str1 = new String("test");
//        String str2 = new String("test");

        changeString(str1);
//        System.out.println(str1);
//        System.out.println(str2);

        String name1 = "name1";
        String name2 = "name1";
//        String name2 = name1;

        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);

//        name1 = "alt string";
//        System.out.println(name1);
//        System.out.println(name2);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>()
        {{
            add(1);
            add(2);
            add(3);
        }};

//        System.out.println(list1 == list2);
        Person person1 = new Person("str1");
        Person person2 = person1;

        changePerson(person1);

//        System.out.println(person1);
//        System.out.println(person2);

        int number = 2;
        changeNumber(2);
//        System.out.println(number);

        System.out.println("======================SINGLETON========================");
        var personService1 = DependencyInversion.getPersonService();
        var personService2 = DependencyInversion.getPersonService();

        System.out.println(personService1 == personService2);

        SingletonInstance singletonInstance1 = SingletonInstance.getInstance();
        SingletonInstance singletonInstance2 = SingletonInstance.getInstance();
        SingletonInstance singletonInstance3 = SingletonInstance.getInstance();
        SingletonInstance singletonInstance4 = SingletonInstance.getInstance();

//        System.out.println(singletonInstance1 == singletonInstance2);
//        System.out.println(singletonInstance2 == singletonInstance3);

        PersonService singletonPersonService1 = SingletonPersonService.getInstance();
        PersonService singletonPersonService2 = SingletonPersonService.getInstance();
        PersonService singletonPersonService3 = SingletonPersonService.getInstance();
        System.out.println(singletonInstance1 == singletonInstance2);
    }

    public static void changePerson(Person person) {
        person.setId("str3");
    }

    public static void changeNumber(int number) {
        number++;
    }

    public static void changeString(String myString) { //comportament de primitive type
        myString = "MyString";
    }
}
