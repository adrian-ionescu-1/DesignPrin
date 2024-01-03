package FunctionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

// predicate este un functional interface care primeste un singur parametru de tip T si returneaza mereu un boolean (true / false)
public class _Predicate {
    public static void main(String[] args) {
        String phoneNumber = "+4054645654";
//        System.out.println(isPhoneNumberValid(phoneNumber));

        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber));
    }

    public static boolean isPhoneNumberValid(String phone) {
        return phone.startsWith("+40");
    }

    public static Predicate<String> isPhoneNumberValidPredicate = phone -> phone.startsWith("+40");

    public static Predicate<String> isPhoneNumberValidPredicate2 = phone -> phone.length() == 10;

    public static Function<String, Boolean> isPhoneNumberValidFunction = phone -> phone.startsWith("+40");

}
