package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConversions {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList()); // conversion of stream to list
        System.out.print(evenNumbersList);

        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list1.add(i);
        }
        Stream<Integer> stream1 = list.stream();
        Integer[] evenNumbersArr = stream1.filter(i -> i%2 == 0).toArray(Integer[]::new); // conversion of stream to array
        System.out.print(Arrays.toString(evenNumbersArr));
    }
}
