package HashSet;

import java.util.*;

public class HashSetRetrievalAndRemoval {

    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>();

        System.out.println("Is popularCities set empty? : " + states.isEmpty()); // checking if HashSet is empty

        states.add("NY");
        states.add("NJ");
        states.add("AR");
        states.add("FL");

        System.out.println("Number of cities in the HashSet " + states.size());  // Finding the size of a HashSet

        String stateAbbreivation = "NJ";
        if(states.contains(stateAbbreivation)) {
            System.out.println(stateAbbreivation + " is in the States HashSet.");
        } else {
            System.out.println(stateAbbreivation + " is not in the popular cities HashSet.");
        }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Removing an element from a HashSet --- returns false if the element does not exist in the HashSet
        boolean isRemoved = numbers.remove(10);
        System.out.println(isRemoved);
        System.out.println("After remove(10) => " + numbers);

        // Remove all elements belonging to a given collection from a HashSet
        List<Integer> perfectSquares = new ArrayList<>();
        perfectSquares.add(4);
        perfectSquares.add(9);

        numbers.removeAll(perfectSquares);
        System.out.println("After removeAll(perfectSquares) => " + numbers);

        numbers.clear(); // clears all the elements in the associated hash set
        System.out.println("After clear() => " + numbers);

    }

 }

