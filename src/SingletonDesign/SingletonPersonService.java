package SingletonDesign;

import SolidPrinciples.PersonService;
import SolidPrinciples.PersonServiceImpl;

public class SingletonPersonService {
    private static PersonService instance;

    private SingletonPersonService() {

    }

    static {
        instance = new PersonServiceImpl();
    }

    public static PersonService getInstance() {
        if (instance == null) {
            instance = new PersonServiceImpl();
        }
        return instance;
    }
}
