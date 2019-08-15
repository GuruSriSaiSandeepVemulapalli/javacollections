package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>();

        states.add("NY");
        states.add("NJ");
        states.add("AR");
        states.add("FL");

        // Different methods and ways we can iterate over a HashSet
        System.out.println("Iterate over a HashSet using Java 8 forEach and lambda");
        states.forEach(System.out::println);

        System.out.println("Iterate over a HashSet using iterator()");
        for (String state : states) {
            System.out.println(state);
        }
        System.out.println("Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method");
        Iterator<String> iterator = states.iterator();
        iterator.forEachRemaining(System.out::println);
    }
}
