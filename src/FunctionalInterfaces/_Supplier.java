package FunctionalInterfaces;

import java.util.function.Supplier;

// o interfata functionala care nu accepta niciun argument si returneaza un result de tip T
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDatabaseConnection());

        System.out.println(getDatabaseConnectionSupplier.get());
    }

    public static String getDatabaseConnection() {
        return "databaseconnection";
    }

    public static Supplier<String> getDatabaseConnectionSupplier = () -> "databaseconnection";
}
