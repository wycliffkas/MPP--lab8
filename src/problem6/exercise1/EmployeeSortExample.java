package src.problem6.exercise1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortExample {

    public static void sortEmployees(List<Employee> employees, Comparator<Employee> comparator) {
        employees.sort(comparator);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 75000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 60000),
                new Employee("David", 75000)
        );

        // Sort by name
        Comparator<Employee> nameComparator = Comparator.comparing(e -> e.name);
        System.out.println("Sorting by name:");
        sortEmployees(employees, nameComparator);
        employees.forEach(System.out::println);

        // Sort by salary
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(e -> e.salary);
        System.out.println("\nSorting by salary:");
        sortEmployees(employees, salaryComparator);
        employees.forEach(System.out::println);
    }
}
