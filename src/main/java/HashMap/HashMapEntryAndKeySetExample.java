package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryAndKeySetExample {

    public static void main(String[] args) {

        Map<String, String> states = new HashMap<>();

        states.put("NewYork","NY" );
        states.put("Arkansas", "AR");
        states.put("Florida", "FL");

        Set<Map.Entry<String, String>> entries = states.entrySet();
        System.out.println("States and their Abbreviations List --- >" + entries);

        Set<String> set = states.keySet();
        System.out.println("States List -- >" + set);

        Collection<String> values = states.values();
        System.out.println("Abbreviates values -- > "+ values);
    }
}
