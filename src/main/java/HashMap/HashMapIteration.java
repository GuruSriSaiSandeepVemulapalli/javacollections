package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {

    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("Sachin", 76000.00);
        employeeSalary.put("Dravid", 120000.00);
        employeeSalary.put("Sehwag", 95000.00);
        employeeSalary.put("Ganguly", 134000.00);

        // Various HashMap iteration methods and their corresponding method implementations
        System.out.println("Iterating over a HashMap using Java 8 forEach and lambda");
        employeeSalary.forEach((employee, salary) -> {
            System.out.println(employee + " => " + salary);
        });

        System.out.println("\n Iterating over the HashMap's entrySet using iterator()");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        for (Map.Entry<String, Double> entry : employeeSalaryEntries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n Iterating over the HashMap's entrySet using Java 8 forEach and lambda");
        employeeSalary.forEach((key, value) -> System.out.println(key + " => " + value));

        System.out.println("\n Iterating over the HashMap's entrySet using simple for-each loop");
        for(Map.Entry<String, Double> entry: employeeSalary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n Iterating over the HashMap's keySet");
        employeeSalary.keySet().forEach(employee -> {
            System.out.println(employee + " => " + employeeSalary.get(employee));
        });
    }
}
