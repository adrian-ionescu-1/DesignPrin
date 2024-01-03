package SingletonDesign;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {

    }

    static {
        instance = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
