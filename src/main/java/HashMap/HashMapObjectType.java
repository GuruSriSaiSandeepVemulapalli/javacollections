package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjectType {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeHashMap = new HashMap<>();

        employeeHashMap.put(1001, new Employee(1001, "Sachin", "Chennai"));
        employeeHashMap.put(1002, new Employee(1002, "Dravid", "Banglore"));
        employeeHashMap.put(1003, new Employee(1003, "Zaheer", "Bombay"));

        System.out.println(employeeHashMap);

    }
}
