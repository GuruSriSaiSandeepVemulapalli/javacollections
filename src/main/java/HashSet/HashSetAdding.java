package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAdding {
    public static void main(String[] args) {
        Set<String> ids = new HashSet<>();

        // Adding new elements to the HashSet
        ids.add("123");
        ids.add("321");
        ids.add("423");
        ids.add("408");
        ids.add("502");
        ids.add("123");

        System.out.println("After adding duplicate entry into hash set"+ ids); // gets ignored duplicates

        List<Integer> numbersDivisibleBy5 = new ArrayList<>();
        numbersDivisibleBy5.add(5);
        numbersDivisibleBy5.add(10);
        numbersDivisibleBy5.add(10);
        numbersDivisibleBy5.add(15);
        numbersDivisibleBy5.add(25);

        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
        numbersDivisibleBy3.add(3);
        numbersDivisibleBy3.add(9);
        numbersDivisibleBy3.add(12);
        numbersDivisibleBy3.add(15);
        numbersDivisibleBy3.add(21);

        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);
        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);
        System.out.println(numbersDivisibleBy5Or3);
    }
}

