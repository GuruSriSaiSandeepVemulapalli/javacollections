package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetObjectType {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("S", 20));
        employees.add(new Employee("A",25));
        employees.add(new Employee("C", 38));

        employees.add(new Employee("S", 20));

        System.out.println(employees);
}
}
