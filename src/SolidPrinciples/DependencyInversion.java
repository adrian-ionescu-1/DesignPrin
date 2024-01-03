package SolidPrinciples;

public class DependencyInversion {

    public static PersonService getPersonService() {
        return new PersonServiceImpl();
    }

    public static ItemService getItemService() {
        return new ItemServiceImpl();
    }
}
