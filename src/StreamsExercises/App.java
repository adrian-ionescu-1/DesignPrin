package StreamsExercises;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        System.out.println("1. List all distinct project in non-ascending order.\n");
        // Extract all projects
        List<Project> allProjects = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .toList();

        // Remove duplicates
        Set<Project> distinctProjects = new HashSet<>(allProjects);

        // Sort in non-ascending order
        List<Project> sortedProjects = distinctProjects.stream()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .toList();

        // Print the projects
        for (Project project : sortedProjects) {
            System.out.println(project.getName());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("2. Print full name of any employee whose firstName starts with ‘A’.\n");
        // Iterate through employees
        for (Employee employee : employeeList) {
            // Check if firstName starts with 'A'
            if (employee.getFirstName().startsWith("A")) {
                // Print full name
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
                // You can add a break statement here if you want to print only the first matching employee.
            }
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("3. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)\n");
        // Get current year (assuming the current year is 2023)
        int currentYear = 2023;

        // Filter employees who joined in year 2023
        List<Employee> employeesJoinedIn2023 = employeeList.stream()
                .filter(employee -> getJoinYear(employee.getId()) == currentYear)
                .toList();

        // Print the filtered employees
        for (Employee employee : employeesJoinedIn2023) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("4. Sort employees based on firstName, for same firstName sort by salary.\n");
        // Sort employees based on firstName, for same firstName sort by salary
        List<Employee> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Comparator.comparingInt(Employee::getSalary).reversed()))
                .toList();

        // Print the sorted employees
        for (Employee employee : sortedEmployees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " - " + employee.getSalary());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).\n");
        int n = 3; // Change this to find nth highest salary

        // Sort employees by salary in descending order
        List<Employee> sortedEmployeesBySalary = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .toList();

        // Find the nth highest salary
        int nthHighestSalary = sortedEmployeesBySalary.get(n - 1).getSalary();

        // Print names of employees with nth highest salary
        List<String> employeesWithNthHighestSalary = sortedEmployeesBySalary.stream()
                .filter(employee -> employee.getSalary() == nthHighestSalary)
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .toList();

        // Print the names
        System.out.println("Employees with " + n + "th highest salary:");
        employeesWithNthHighestSalary.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");

        System.out.println("6. Print min salary.\n");
        // Find the minimum salary
        Optional<Integer> minSalary = employeeList.stream()
                .map(Employee::getSalary)
                .min(Integer::compare);

        // Print the minimum salary
        minSalary.ifPresent(System.out::println);
        System.out.println("-------------------------------------------------------------");

        System.out.println("7. Print list of all employee with min salary.\n");
        // If minSalary is present, filter employees with that salary
        if (minSalary.isPresent()) {
            int minSalaryValue = minSalary.get();

            List<Employee> employeesWithMinSalary = employeeList.stream()
                    .filter(employee -> employee.getSalary() == minSalaryValue)
                    .toList();

            // Print the employees with minimum salary
            for (Employee employee : employeesWithMinSalary) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("8. List of people working on more than 2 projects.\n");
        // Filter employees working on more than 2 projects
        List<Employee> employeesWorkingOnMoreThanTwoProjects = employeeList.stream()
                .filter(employee -> employee.getProjects().size() > 2)
                .toList();

        // Print the employees
        for (Employee employee : employeesWorkingOnMoreThanTwoProjects) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("9. Count of total laptops assigned to the employees.\n");
        // Calculate total laptops assigned
        int totalLaptopsAssigned = employeeList.stream()
                .mapToInt(Employee::getTotalLaptopsAssigned)
                .sum();

        // Print the total laptops assigned
        System.out.println("Total laptops assigned: " + totalLaptopsAssigned);
        System.out.println("-------------------------------------------------------------");

        System.out.println("10. Count of all projects with Robert Downey Jr as PM.\n");
        // Count projects with Robert Downey Jr as PM
        long projectsWithRobertDowneyJr = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .count();

        // Print the count
        System.out.println("Projects with Robert Downey Jr as PM: " + projectsWithRobertDowneyJr);
        System.out.println("-------------------------------------------------------------");

        System.out.println("11. List of all projects with Robert Downey Jr as PM.\n");
        // Filter projects with Robert Downey Jr as PM
        List<Project> projectsWithRobertDowneyJrPM = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .toList();

        // Print the projects
        for (Project project : projectsWithRobertDowneyJrPM) {
            System.out.println(project.getName());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("12. List of all people working with Robert Downey Jr.\n");
        // Find all employees working with Robert Downey Jr
        List<Employee> employeesWorkingWithRobertDowneyJr = employeeList.stream()
                .filter(employee -> employee.getProjects().stream()
                        .anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr")))
                .toList();

        // Print the employees
        for (Employee employee : employeesWorkingWithRobertDowneyJr) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("13. Create a map based on this data, they key should be the year of joining, and value should be list of all the employees who joined the particular year.\n");
        // Create a map based on the year of joining
        Map<Integer, List<Employee>> employeesByJoinYear = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> Integer.parseInt(employee.getId().substring(0, 4))));

        // Print the map
        employeesByJoinYear.forEach((year, employees) -> {
            System.out.println("Year: " + year);
            for (Employee employee : employees) {
                System.out.println("  " + employee.getFirstName() + " " + employee.getLastName());
            }
        });
        System.out.println("-------------------------------------------------------------");

        System.out.println("14. Create a map based on this data, the key should be year of joining and value should be the count of people joined in that particular year.\n");
        // Create a map based on the year of joining and count of people
        Map<Integer, Long> joinYearCountMap = employeeList.stream()
                .collect(Collectors.groupingBy(
                        employee -> Integer.parseInt(employee.getId().substring(0, 4)),
                        Collectors.counting()
                ));

        // Print the map
        joinYearCountMap.forEach((year, count) ->
                System.out.println("Year: " + year + ", Count: " + count)
        );
        System.out.println("-------------------------------------------------------------");
    }

    // Method to extract the year from employee ID
    private static int getJoinYear(String id) {
        String yearString = id.substring(0, 4);
        return Integer.parseInt(yearString);
    }
}
