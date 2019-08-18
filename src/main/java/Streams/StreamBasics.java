package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {

    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Ram");
        memberNames.add("Andy");
        memberNames.add("Maggie");
        memberNames.add("Sandy");
        memberNames.add("Andrew");

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(x -> System.out.println("Members starting with A --->" + x));
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(x -> System.out.println("Members starting with A converted to upper case --->" + x));
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(x -> System.out.println("Members sorted based on Upper case ---> " + x));
        memberNames.forEach(System.out::println);

        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(memNamesInUppercase);

        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);

        long count = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
        System.out.println("Count -- > " + count);
    }
}
