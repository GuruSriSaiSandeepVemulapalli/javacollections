package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {
    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>();

        programmingLanguages.add("JAVA");
        programmingLanguages.add("C");
        programmingLanguages.add("Python");

        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
        programmingLanguages.forEach(System.out::println);


        System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
        Iterator<String> programmingLanguagesIterator = programmingLanguages.iterator();
        while (programmingLanguagesIterator.hasNext()) {
            String programmingLanguage = programmingLanguagesIterator.next();
            System.out.println(programmingLanguage);
        }

        System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
        programmingLanguagesIterator = programmingLanguages.iterator();
        programmingLanguagesIterator.forEachRemaining(System.out::println);

        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
        Iterator<String> descendingIterator = programmingLanguages.descendingIterator();
        while (descendingIterator.hasNext()) {
            String programmingLanguage = descendingIterator.next();
            System.out.println(programmingLanguage);
        }


        System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
        // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards
        ListIterator<String> listIterator = programmingLanguages.listIterator(programmingLanguages.size());
        while (listIterator.hasPrevious()) {
            String programmingLanguage = listIterator.previous();
            System.out.println(programmingLanguage);
        }

        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
        for(String programmingLanguage: programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}
