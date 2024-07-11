package src.problem2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};

    public void sort(List<Employee> emps, SortMethod method) {
        Collections.sort(emps, (e1, e2) -> {
            if (method == SortMethod.BYNAME) {
                int nameComparison = e1.name.compareTo(e2.name);
                if (nameComparison != 0) {
                    return nameComparison;
                }
                // If names are equal, compare by salary
                return Integer.compare(e1.salary, e2.salary);
            } else {
                return Integer.compare(e1.salary, e2.salary);
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Joe", 150000)); // Added for testing

        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
        System.out.println(emps);
        // same instance
        ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
        System.out.println(emps);
    }
}

