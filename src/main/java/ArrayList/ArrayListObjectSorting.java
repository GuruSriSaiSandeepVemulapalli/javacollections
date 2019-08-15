package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSorting {

        private String name;
        private Integer age;

        public ArrayListObjectSorting(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    public static void main(String[] args) {
        List<ArrayListObjectSorting> people = new ArrayList<>();
        people.add(new ArrayListObjectSorting("Sachin", 47));
        people.add(new ArrayListObjectSorting("Chris", 34));
        people.add(new ArrayListObjectSorting("Rajeev", 25));
        people.add(new ArrayListObjectSorting("David", 31));

        System.out.println("Person List : " + people);

        // Sort People by their Age
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });

        // A more concise way of writing the above sorting function
        people.sort(Comparator.comparingInt(ArrayListObjectSorting::getAge));

        System.out.println("Sorted Person List by Age : " + people);

        // You can also sort using Collections.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(ArrayListObjectSorting::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }

}

