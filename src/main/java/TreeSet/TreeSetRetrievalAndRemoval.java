package TreeSet;

import java.util.TreeSet;

public class TreeSetRetrievalAndRemoval {

    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        states.add("NY");
        states.add("NJ");
        states.add("AR");
        states.add("FL");

        System.out.println("States TreeSet : " + states);

        // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + states.size());

        // Check if an element exists in the TreeSet
        String name = "NY";
        if(states.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + states.first());
        System.out.println("Last element : " + states.last());

        name = "NJ";
        System.out.println("Element just greater than "  + name + " : " + states.higher(name));
        System.out.println("Element just lower than "  + name + " : " + states.lower(name));

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(42);

        System.out.println("numbers TreeSet : " + numbers);
        boolean removed = numbers.remove(20);
        if(removed) {
            System.out.println("After Removing 49 : " + numbers);
        }

        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("After removeIf() : " + numbers);

        Integer num = numbers.pollFirst();
        System.out.println("Removed first element " + num + " from the TreeSet : " + numbers); // retrieving and removing first element

        num = numbers.pollLast();
        System.out.println("Removed last element " + num + " from the TreeSet : " + numbers); // retrieving and removing last element
    }
}

