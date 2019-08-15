package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreation {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();

        // Adding new elements to the ArrayList
        states.add("NY");
        states.add("NJ");
        states.add("AR");
        states.add("CA");

        System.out.println(states);

        // Adding an element at a particular index in an ArrayList
        states.add(2, "FL");

        System.out.println(states);

        List<String> nextFiveStates = new ArrayList<>();
        nextFiveStates.add("AL");
        nextFiveStates.add("AK");
        nextFiveStates.add("AZ");
        nextFiveStates.add("CO");
        nextFiveStates.add("CT");

        states.addAll(nextFiveStates);
        System.out.println("AFter adding next 5 states -- >" + states);
    }
}
