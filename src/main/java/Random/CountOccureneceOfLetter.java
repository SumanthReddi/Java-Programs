
package Random;

import java.util.HashMap;
import java.util.Map;

public class CountOccureneceOfLetter {
    public static void main(String[] args) {
        String str1 = "aaabbc";
        str1 = str1.toLowerCase();
        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap();

        for(char c : chars) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, (Integer)charsCount.get(c) + 1);
            } else {
                charsCount.put(c, 1);
            }
        }

        System.out.println(charsCount);

        for(Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            System.out.print("" + entry.getKey() + entry.getValue());
        }

    }
}
