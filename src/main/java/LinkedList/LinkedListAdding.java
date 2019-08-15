package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAdding {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();

        states.add("NY");
        states.add("NJ");

        System.out.println("Initial LIST OF PLACES"+ states);

        states.add(2, "CA");
        System.out.println("After adding the new index value 2" + states);

        // replacing the last value in the list
        states.addLast("AR");
        System.out.println("After adding the last value" + states);

        // Adding all the elements from an existing collection to the end of the LinkedList

        List<String> cities = new ArrayList<>();
        cities.add("Hicksville");
        cities.add("Charolette");

        states.addAll(cities);
        System.out.println("After addAll cities to the states" + states);
    }

}
