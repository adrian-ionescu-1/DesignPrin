package SingletonDesign;

public class SingletonInstance {

    private static SingletonInstance instance;

    private SingletonInstance() {

    }

    static {
        try {
            instance = new SingletonInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
    }

    public static SingletonInstance getInstance() {
        if (instance == null) {
            instance = new SingletonInstance();
        }
        return instance;
    }

}
