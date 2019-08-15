package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectType {

        private String name;
        private int age;

        public ArrayListObjectType(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static void main(String[] args) {
            List<ArrayListObjectType> users = new ArrayList<>();
            users.add(new ArrayListObjectType("Rajeev", 25));
            users.add(new ArrayListObjectType("John", 34));
            users.add(new ArrayListObjectType("Steve", 29));

            users.forEach(user -> {
                System.out.println("Name --> " + user.getName() + ", Age --> " + user.getAge());
            });
        }
}
