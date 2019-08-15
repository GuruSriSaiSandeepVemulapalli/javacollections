package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAdding {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("R", 1);
        employees.put("A", 2);
        employees.put("M", 3);

        employees.putIfAbsent("S", 4);

        employees.putIfAbsent("R", 1); // doesnt add duplicate key value pair entry
        System.out.println(employees);
    }
}
