package Streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreationTypes {

    // Various Types in which streams can be created
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        Stream<Integer> streamArray = Stream.of(1,2,3,4,5,6,7,8,9);
        streamArray.forEach(System.out::println);

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> streamList = list.stream();
        streamList.forEach(System.out::println);

        Stream<Date> streamDate = Stream.generate(Date::new);
        streamDate.forEach(System.out::println);
    }
}
