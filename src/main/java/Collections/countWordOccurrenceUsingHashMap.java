//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class countWordOccurrenceUsingHashMap {
    public static void main(String[] args) {
        String str = "cts cts is multinational company company";
        Map<String, Integer> hasMap = new LinkedHashMap();
        String[] words = str.split(" ");

        for(String word : words) {
            Integer integer = (Integer)hasMap.get(word);
            if (integer == null) {
                hasMap.put(word, 1);
            } else {
                hasMap.put(word, integer + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : hasMap.entrySet()) {
            System.out.println((String)entry.getKey() + " - " + entry.getValue());
        }

    }
}
