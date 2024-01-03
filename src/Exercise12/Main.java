package Exercise12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Manufacturer> mercedesManufacturers = new ArrayList<>();
        mercedesManufacturers.add(new Manufacturer("Engine", 2020, "Germany"));
        mercedesManufacturers.add(new Manufacturer("wheels", 2010, "Romania"));
        mercedesManufacturers.add(new Manufacturer("windscreen", 2015, "Poland"));
        Car car1 = new Car("Mercedes", "S200", 20000, 2022, mercedesManufacturers, EngineType.V12);

        List<Manufacturer> audiManufacturers = new ArrayList<>();
        audiManufacturers.add(new Manufacturer("Engine", 2010, "Germany"));
        audiManufacturers.add(new Manufacturer("wheels", 2020, "Romania"));
        audiManufacturers.add(new Manufacturer("Display", 2020, "Spain"));
        Car car2 = new Car("Audi", "q5", 30000, 2020, audiManufacturers, EngineType.V8);
        Car car3 = new Car("Ford", "Fiesta", 22000, 2018, audiManufacturers, EngineType.V12);

        List<Manufacturer> fordManufacturers = new ArrayList<>();
        fordManufacturers.add(new Manufacturer("Engine", 1966, "Germany"));
        fordManufacturers.add(new Manufacturer("wheels", 2022, "Italy"));
        Car car4 = new Car("Ford", "Mustang", 40000, 1967, fordManufacturers, EngineType.S6);
        Car car5 = new Car("Ford", "Shelby", 30000, 1990, fordManufacturers, EngineType.V12);

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
        carService.addCar(new Car("Mercedes", "E", 35000,2023, mercedesManufacturers, EngineType.S3));

//        carService.removeCar(new Car("Ford", "Mustang", 40000, 1967, fordManufacturers, EngineType.S6));

//        carService.getCars().forEach(System.out::println);

//        carService.getCarsWithV12().forEach(System.out::println);

//        carService.getCarsBefore1999().forEach(System.out::println);

//        Car car = carService.getTheMostExpensiveCar();
//        System.out.println(car);

//        Car car = carService.getTheCheapestCar();
//        System.out.println(car);

//        carService.getCarsSortedByFieldAsc(FieldComparator.MODEL, SortDirection.DESC).forEach(System.out::println);

//        boolean result = carService.contains(new Car("Ford", "Mustang", 40000, 1967, fordManufacturers, EngineType.S6));
//        System.out.println(result);

//        Car car7 = new Car("Ford", "Mustang", 40000, 1968, fordManufacturers, EngineType.S6);
//        Car car8 = new Car("Ford", "Mustang", 40000, 1967, fordManufacturers, EngineType.S6);
//        car7.equals(FieldComparator.MODEL);
//        System.out.println(car7.hashCode());
//        System.out.println(car8.hashCode());
        //Ford: 12
        //Mustang: 20
        //40000: 7

        //39
        //39

        //CAR
        //FieldComparator

//        System.out.println(car7.equals(car8));

//        carService.getCarsContainsManufacturer(new Manufacturer("Engine", 2020, "Germany")).forEach(System.out::println);

//        carService.getCarsWithManufacturersYearComparingBy(2020, CompareSign.NOT_EQUAL).forEach(System.out::println);

//        carService.getAllModels().forEach(System.out::println);
//        carService.getManufacturersNames().forEach(System.out::println);
//        carService.getManufacturersYears().forEach(System.out::println);
//          carService.getYearsOfProduction().forEach(System.out::println);
//          carService.getModelsWithEvenYearOfProduction().forEach(System.out::println);
        carService.getCarsEvenYearProdOddYearManufacture().forEach(System.out::println);

    }
}
