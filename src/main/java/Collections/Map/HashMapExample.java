package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> hp = new HashMap<>();
        hp.put("firstName", "Neeraj");
        hp.put("lastName", "Napit");

        String value = hp.get("lastName");

        System.out.println(value);
    }
}