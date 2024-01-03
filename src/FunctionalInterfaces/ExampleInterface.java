package FunctionalInterfaces;

@FunctionalInterface //check
public interface ExampleInterface {

    public abstract void print1();

    default void print2() {
        System.out.println(2);
    }

    // nu este metoda abstracta pentru ca are implementare
    default void print3() {
        System.out.println(3);
    }
}
