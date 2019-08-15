package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapRetrievalAndRemoval {

    public static void main(String[] args) {

        TreeMap<String, String> employees = new TreeMap<>();

        employees.put("101", "R");
        employees.put("102", "A");
        employees.put("103", "M");

        System.out.println("Employees map : " + employees);

        // Finding the size of a TreeMap
        System.out.println("Total number of employees : " + employees.size());

        // Check if a given key exists in a TreeMap
        String id = "101";
        if(employees.containsKey(id)) {
            // Get the value associated with a given key in a TreeMap
            String name = employees.get(id);
            System.out.println("Employee with id " + id + " : " + name);
        } else {
            System.out.println("Employee does not exist with id : " + id);
        }

        // Find the first and last entry
        System.out.println("First entry in employees map : " + employees.firstEntry());
        System.out.println("Last entry in employees map : " + employees.lastEntry());

        // Find the entry whose key is just less than the given key
        Map.Entry<String, String> employeeJustBelow = employees.lowerEntry("102");
        System.out.println("Employee just below id 102 : " + employeeJustBelow);

        // Find the entry whose key is just higher than the given key
        Map.Entry<String, String> employeeJustAbove = employees.higherEntry("101");
        System.out.println("Employee just above id 101 : " + employeeJustAbove);

        TreeMap<String, String> states = new TreeMap<>();

        states.put("NewYork","NY" );
        states.put("Arkansas", "AR");
        states.put("Florida", "FL");
        states.put("Colorado","CO");
        states.put("NewJersey","NJ");
        states.put("NewHampshire", "NH");

        System.out.println("StateAbbreivationsKeyMapping : " + states);

        String stateName = "NewYork";
        String abbreivation = states.remove(stateName);
        if(abbreivation != null) {
            System.out.println("Removed (" + stateName + " => " + abbreivation + ") from the TreeMap. New TreeMap " + states);
        } else {
            System.out.println(stateName + " does not exist, or it is mapped to a null value");
        }

        String stateName1 = "NewJersey";
        boolean isRemoved = states.remove(stateName1, "NJ");
        System.out.println("Was the mapping removed for " + stateName1 + "? : " + isRemoved);

        Map.Entry<String, String> firstEntry = states.pollFirstEntry();
        System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + states);

        // Remove the last entry from the TreeMap
        Map.Entry<String, String> lastEntry = states.pollLastEntry();
        System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + states);
    }
}