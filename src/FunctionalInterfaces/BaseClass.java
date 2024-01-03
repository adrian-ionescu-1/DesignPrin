package FunctionalInterfaces;

public abstract class BaseClass {
    public void print1() {
        System.out.println(1);
    }

    // metoda abstracta, nu are implementare in base class dar TREBUIE sa aiba implementare in child class
    public abstract void print2();
}
