package SolidPrinciples;

public class DatabaseExample {

    public static void findPersonById(Person person) {
        System.out.println("Persoana cu id: " + person.getId() + " a fost gasita");
    }

    public static void findStudentById(Student person) {
        System.out.println("Persoana cu id: " + person.getId() + " a fost gasita");
    }

    public static void findCustomerById(Customer person) {
        System.out.println("Persoana cu id: " + person.getId() + " a fost gasita");
    }
}
