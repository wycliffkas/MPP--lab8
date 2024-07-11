package src.problem2.a;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComparison = e1.name.compareTo(e2.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(e1.salary, e2.salary);
    }
}

