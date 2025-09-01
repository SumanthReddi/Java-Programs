
package Collections;

import java.util.Map;
import java.util.TreeMap;

public class treeMapPractice {
    public static void main(String[] args) {
        Map<String, String> hp = new TreeMap();
        hp.put("lastName", "Neeraj");
        hp.put("firstName", "Napit");
        System.out.println((String)hp.put("phone", "8709627406"));
        System.out.println(hp);
        System.out.println((String)hp.get("firstName"));

        for(Map.Entry<String, String> entry : hp.entrySet()) {
            System.out.println((String)entry.getKey() + " - " + (String)entry.getValue());
        }

    }
}
