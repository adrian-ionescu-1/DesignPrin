package SolidPrinciples;

public class EntityServiceImpl implements EntityService {
    @Override
    public void addPerson(Person person) {
        System.out.println("Person added");
    }

    @Override
    public void printPerson(Person person) {
        System.out.println(person);
    }

    @Override
    public void addItem(Item item) {
        System.out.println("Item added");
    }

    @Override
    public void printItem(Item item) {
        System.out.println(item);
    }
}
