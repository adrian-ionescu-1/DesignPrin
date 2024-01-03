package SolidPrinciples;

public class PersonServiceImpl implements PersonService {
    @Override
    public void addPerson(Person person) {
        System.out.println("Person added");
    }

    @Override
    public void printPerson(Person person) {
        System.out.println(person);
    }
}
