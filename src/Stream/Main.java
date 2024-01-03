package Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 1, 2, 3, 7, 8, 7, 7, 10, 11, 12);

        Set<Integer> set = new HashSet<>(integers);
        System.out.println(set);

        Set<Integer> mySet = integers.stream().collect(Collectors.toSet());
        System.out.println(mySet);


        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Focus", 2010));
        carList.add(new Car("Skoda", "Octavia", 2019));
        carList.add(new Car("BMW", "Serie 3", 2009));
        carList.add(new Car("Hyndai", "Elantra", 2018));

        // imperative approach
        List<Car> newCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() > 2010) {
                newCars.add(car);
            }
        }
        System.out.println(newCars);

        //Declarative approach
        // filter returneaza mereu true sau false..sa stie cum sa aplice filtrarea. Aplica pe baza de boolean
        List<Car> myCars = carList.stream().filter(car -> car.getYear() > 2010).collect(Collectors.toList());
//        carList.stream()
        System.out.println(myCars);
    }
}
