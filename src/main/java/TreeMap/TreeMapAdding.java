package TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAdding {

    public static void main(String[] args) {
        SortedMap<String, String> employees = new TreeMap<>();

        // Adding new key-value pairs to a TreeMap
        employees.put("R", "101");
        employees.put("A", "102");
        employees.put("M", "103");

        // Printing the TreeMap (Output will be sorted based on keys)
        System.out.println("Tree Map Entries: -- > " + employees);

        SortedMap<String, String> fileExtensions = new TreeMap<>(Comparator.reverseOrder());
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        System.out.println("Tree Map Entries with Custom Comparator ---->" + fileExtensions); // output sorted and printed based on custom comparator provided

        SortedMap<String, String> fileExtensions1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        fileExtensions1.put("PYTHON", ".py");
        fileExtensions1.put("c++", ".cpp");
        fileExtensions1.put("KOTLIN", ".kt");
        fileExtensions1.put("Golang", ".go");

        System.out.println("Tree Map Entries with Custom Comparator ignoring Case ---- > "+ fileExtensions1); // The keys will be sorted ignoring the case



    }
}
