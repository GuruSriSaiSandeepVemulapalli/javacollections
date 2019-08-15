package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrievalAndRemoval {

    public static void main(String[] args) {
        List<String> states = new ArrayList<>();

        System.out.println("Is the array list empty? : " + states.isEmpty());

        // Adding new elements to the ArrayList
        states.add("NY");
        states.add("NJ");
        states.add("AR");
        states.add("CA");

        System.out.println("No of states in array list " + states.size());
        System.out.println(states);

        // Retrieve the element at a given index
        String firststate = states.get(0);
        String secondstate = states.get(1);
        String laststate = states.get(states.size() - 1);

        System.out.println("first state: " + firststate);
        System.out.println("Second Best Company: " + secondstate);
        System.out.println("Last State in the list: " + laststate);

        // Modify the element at a given index
        states.set(3, "CO");
        System.out.println("Modified States list: " + states);

    }
}
