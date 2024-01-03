package SolidPrinciples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//SOLID, DRY, KISS, yagni
//S - Single Responsability
//O - Open extension, close for modification
//L - Liskov substitution
//I - Interface Segregation
//D - Dependency Inversion / Dependency Injection

public class Main {
    public static void main(String[] args) {
//        Person person = new Person(1, "Person1", "person1@test.com", 20);
        Customer customer = new Customer(1, "Customer1", "customer1@test.com", 20, "order1", LocalDate.now());
        Student student = new Student(2, "Student1", "student1@gmail.com", 21, 10);

        Person customer2 = new Customer(1, "Customer1", "customer1@test.com", 20, "order1", LocalDate.now());
        Person student2 = new Student(2, "Student1", "student1@gmail.com", 21, 10);

        SingleResponsability.printCustomer(customer);
        SingleResponsability.printStudent(student);

        SingleResponsability.printPerson(customer2);
        SingleResponsability.printPerson(student2);

        DatabaseExample.findPersonById(customer2);
        DatabaseExample.findPersonById(student2);

//        SingleResponsability.printPerson(person);
//        SingleResponsability.printCustomer(customer);

        ArrayList<String> names = new ArrayList<>()
        {{
            add("test1");
            add("name1");
        }};
//        names.add("test1");
//        names.add("name1");
        names.add("element1");
        names.remove(1);
        System.out.println(names);


        List<String> list = List.of("test1", "element1", "name1"); //immbutable list, cannot be modificated
//      Immutable list -> open for extensions, close for modifications
//        list.add("newElement");

        int size = list.size();
        boolean result = list.contains("test1");
        boolean isEmpty = list.isEmpty();

//        System.out.println("Size is " + size);
//        System.out.println("Contains test1: " + result);
//        System.out.println("isEmpty: " + isEmpty);
//        list.forEach(abc -> System.out.println(abc));

//        for (int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        int index = 0;
//        while (index < list.size()) {
//            System.out.println(list.get(index));
//            index++;
//        }

//        System.out.println(LocalDateTime.now());

        List<String> list2 = new ArrayList<>();
        list2.add("el1");
        list2.add("el2");

        list2 = new LinkedList<>();
        list2.add("linkedelement");

        System.out.println("======================================================================");

        PersonService personService = DependencyInversion.getPersonService();
        ItemService itemService = DependencyInversion.getItemService(); //new

        personService.addPerson(customer2);
        personService.printPerson(student2);

        itemService.addItem(new Item(1, "Item1"));
        itemService.printItem(new Item(2, "Item2"));
    }
}
