package SolidPrinciples;

public class SingleResponsability {
    public static void printPerson(Person person) {
        System.out.println(person);
    }

    public static void printCustomer(Customer customer) {
        System.out.println(customer);
    }

    public static void printStudent(Student student) {
        System.out.println(student);
    }
}
