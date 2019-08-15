package TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCustomComparator {

    public static void main(String[] args) {
        // Testing creation of Tree set with Custom Comparator
        SortedSet<String> states1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        states1.add("NY");
        states1.add("NJ");
        states1.add("AR");
        System.out.println("TreeSet of States : " + states1);
        // adding duplicate entries
        states1.add("ar");
        System.out.println("After adding \"ar\" : " + states1);  // Now, lowercase elements will also be considered as duplicates

        // Creating a TreeSet with a custom Comparator (Descending  Order)
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set after Reverse order comparator : " + fruits);
    }
}
