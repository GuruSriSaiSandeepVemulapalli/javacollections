package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAdding {

    public static void main(String[] args) {

        SortedSet<String> states = new TreeSet<>(); // Creating a TreeSet
        states.add("NY");
        states.add("NJ");
        states.add("AR");

        System.out.println("TreeSet of States:" + states);

        // Adding duplicate entry into tree set
        states.add("AR");
        System.out.println("Testing Duplicate Entries in tree set"+ states);

        // Entry gets added as it's in lowercase.
        states.add("ar");
        System.out.println("Testing Duplicate Entries in tree set"+ states);

    }
}
