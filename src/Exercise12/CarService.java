package Exercise12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars = new ArrayList<>();
    
    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        if (cars.contains(car)) {
            cars.remove(car);
        } else {
            System.out.println("The list does not contain this car!");
        }
    }

    public List<Car> getCars(){
        return cars;
    }

    public List<Car> getCarsWithV12(){
        return cars.stream().filter(car -> car.getEngineType().equals(EngineType.V12)).toList();
    }

    public List<Car> getCarsBefore1999(){
        return cars.stream().filter(car -> car.getYearOfManufacture() < 1999).toList();
    }

    public Car getTheMostExpensiveCar(){
        Comparator<Car> comparator = (car1, car2) -> car1.getPrice().compareTo(car2.getPrice());
        return cars.stream().max(comparator).get();
    }

    public Car getTheCheapestCar(){
        Comparator<Car> comparator = (car1, car2) -> car1.getPrice().compareTo(car2.getPrice());
        return cars.stream().min(comparator).get();
    }

    public List<Car> getCarsAtLeast3Manufacturers() {
        return cars.stream().filter(car -> car.getManufacturers().size() >= 3).toList();
    }

    public List<Car> getCarsSortedByFieldAsc(FieldComparator field, SortDirection sortDirection) {
//        Comparator<Car> comparator = null;
//        if (field.equals(FieldComparator.NAME)) {
//            comparator = Comparator.comparing(Car::getName);
//        } else if (field.equals(FieldComparator.MODEL)) {
//            comparator = Comparator.comparing(Car::getModel);
//        } else if (field.equals(FieldComparator.PRICE)) {
//            comparator = Comparator.comparing(Car::getPrice);
//        } else if (field.equals(FieldComparator.YEAR)) {
//            comparator = Comparator.comparing(Car::getYearOfManufacture);
//        } else if (field.equals(FieldComparator.ENGINE_TYPE)) {
//            comparator = Comparator.comparing(Car::getEngineType);
//        }
        Comparator<Car> comparator = null;
        switch (field) {
            case NAME:
                comparator = Comparator.comparing(Car::getName);
                break;
            case MODEL:
                comparator = Comparator.comparing(Car::getModel);
                break;
            case PRICE:
                comparator = Comparator.comparing(Car::getPrice);
                break;
            case YEAR:
                comparator = Comparator.comparing(Car::getYearOfManufacture);
                break;
            case ENGINE_TYPE:
                comparator = Comparator.comparing(Car::getEngineType);
                break;
            default:
                System.out.println("FieldComparator does not exist");
//                throw new RuntimeException("FieldComparator does not exist");
        }

        if (sortDirection.equals(SortDirection.DESC)) {
            comparator = comparator.reversed();
        }

        return cars.stream().sorted(comparator).toList();
    }

    public List<Car> getCarsSortedByNameDesc() {
//        Comparator<Car> comparator = (car1, car2) -> car2.getName().compareTo(car1.getName());
        Comparator<Car> comparator = Comparator.comparing(Car::getName).reversed();
        return cars.stream().sorted(comparator).toList();
    }

    public boolean contains(Car car) {
//        cars.stream().
        return cars.contains(car);
    }

    public List<Car> getCarsContainsManufacturer(Manufacturer manufacturer) {
        Predicate<Car> predicate = car -> {
            return car.getManufacturers().contains(manufacturer);
        };
        return cars.stream().filter(car -> car.getManufacturers().contains(manufacturer)).toList();
    }

    public List<Car> getCarsWithManufacturersYearComparingBy(int year, CompareSign compareSign) {
        Predicate<Manufacturer> predicate = null;
        switch (compareSign) {
            case LESS_THAN:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() < year;
                break;
            case LESS_THAN_EQUAL:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() <= year;
                break;
            case EQUAL:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() == year;
                break;
            case GREATER_THAN:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() > year;
                break;
            case GREATER_THAN_EQUAL:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() >= year;
                break;
            case NOT_EQUAL:
                predicate = manufacturer -> manufacturer.getYearOfEstablishment() != year;
                break;
            default:
                System.out.println("Error");
        }
        Predicate<Manufacturer> finalPredicate = predicate;
        return cars.stream().filter(car -> car.getManufacturers().stream().allMatch(finalPredicate)).toList();
    }

    public List<String> getAllModels(){
        Function<Car, String> function = car -> {
            return car.getModel();
        };
        return cars.stream().map(car -> car.getModel()).toList();
    }

    public Set<String> getManufacturersNames(){
        List<List<String>> namesList = cars.stream().map(car -> car.getManufacturers().stream().map(manufacturer -> manufacturer.getName()).toList()).toList();
        return namesList.stream().flatMap(List::stream).collect(Collectors.toSet());
    }

    public Set<Integer> getManufacturersYears(){
        List<List<Integer>> yearsList = cars.stream().map(car -> car.getManufacturers().stream().map(manufacturer -> manufacturer.getYearOfEstablishment()).toList()).toList();
        return yearsList.stream().flatMap(List::stream).collect(Collectors.toSet());
    }

    public List<Integer> getYearsOfProduction(){
        return cars.stream().map(car -> car.getYearOfManufacture()).toList();
    }

    public List<Car> getModelsWithEvenYearOfProduction(){
        return cars.stream().filter(car -> car.getYearOfManufacture()%2==0).toList();
    }

    public List<Car> getCarsEvenYearProdOddYearManufacture(){
        return cars.stream().filter(car -> car.getYearOfManufacture()%2==0 &&
                car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment()%2 != 0)).toList();
    }
}
