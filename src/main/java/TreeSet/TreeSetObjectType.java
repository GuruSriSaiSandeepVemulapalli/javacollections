package TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetObjectType{

    public static void main(String[] args) {
        SortedSet<Employee> employees = new TreeSet<>();

        // TreeSet uses the compareTo() method of the Employee class to compare two employees and sort them
        employees.add(new Employee("Sachin", 20));
        employees.add(new Employee("virat", 25));
        employees.add(new Employee("rohith", 35));

        Employee employee = new Employee("",20);

        System.out.println("Employees (sorted based on Employee class's compareTo() function)");
        System.out.println(employees);
        employees = new TreeSet<>(Comparator.comparing(Employee::getName));

        employees.add(new Employee("Sachin", 20));
        employees.add(new Employee("virat", 25));
        employees.add(new Employee("rohith", 35));

        System.out.println("\nEmployees (sorted based on the supplied Comparator)");
        System.out.println(employees);

    }
}
