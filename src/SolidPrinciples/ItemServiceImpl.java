package SolidPrinciples;

public class ItemServiceImpl implements ItemService {
    @Override
    public void addItem(Item item) {
        System.out.println("Item added");
    }

    @Override
    public void printItem(Item item) {
        System.out.println(item);
    }
}
