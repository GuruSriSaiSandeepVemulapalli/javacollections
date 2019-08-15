package LinkedList;

import java.util.LinkedList;

public class LinkedListRetrieval {
    public static void main(String[] args) {
        LinkedList<Integer> salaries = new LinkedList<>();

        salaries.add(4500);
        salaries.add(5100);
        salaries.add(6250);
        salaries.add(4275);
        salaries.add(3680);
        salaries.add(6840);

        // Getting the first element in the LinkedList using getFirst()
        // The getFirst() method throws NoSuchElementException if the LinkedList is empty
        Integer firstElement = salaries.getFirst();
        System.out.println("Initial Salary : " + firstElement);

        // Getting the last element in the LinkedList using getLast()
        // The getLast() method throws NoSuchElementException if the LinkedList is empty
        Integer lastElement = salaries.getLast();
        System.out.println("Current salary : " + lastElement);

        // Getting the element at a given position in the LinkedList
        Integer stockPriceOn3rdDay = salaries.get(2);
        System.out.println("Salary from 3rd month  : " + stockPriceOn3rdDay);
    }
}