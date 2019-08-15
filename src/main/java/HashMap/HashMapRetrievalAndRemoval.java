package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapRetrievalAndRemoval {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is employees mapping empty? : " + employees.isEmpty());

        employees.put("R", 1);
        employees.put("A", 2);
        employees.put("M", 3);

        System.out.println("employees HashMap : " + employees);
        System.out.println("Employees hashmap size---> "+ employees.size()); // finds the size of HashMap

        String userName = "R";
        // Check if a key exists in the HashMap
        if(employees.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            Integer id = employees.get(userName);
            System.out.println("Id of the user provided ---> " + id);
        } else {
            System.out.println("ID details not found for user " + userName);
        }

        if(employees.containsValue("Z")) {
            System.out.println("An ID exists for the provided user");
        } else {
            System.out.println("An ID does not exists for the provided user");
        }

        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        System.out.println("Husband-Wife Mapping : " + husbandWifeMapping);

        // Remove a key from the HashMap
        // Ex - Unfortunately, Chris got divorced. Let's remove him from the mapping
        String husband = "Chris";
        String wife = husbandWifeMapping.remove(husband);

        System.out.println("Couple (" + husband + " => " + wife + ") got divorced");
        System.out.println("New Mapping : " + husbandWifeMapping);

        // Remove a key from the HashMap only if it is mapped to the given value
        // Ex - Divorce "Jack" only if He is married to "Linda"
        boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
        System.out.println("Did Jack get removed from the mapping? : " + isRemoved);

        // remove() returns null if the mapping was not found for the supplied key
        wife = husbandWifeMapping.remove("David");
        if(wife == null) {
            System.out.println("Looks like David is not married to anyone");
        } else {
            System.out.println("Removed David and his wife from the mapping");
        }
    }

}
