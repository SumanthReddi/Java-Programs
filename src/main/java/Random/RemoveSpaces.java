
package Random;

import java.util.HashMap;
import java.util.Map;

public class RemoveSpaces {
    public static void main(String[] args) {
        String word = "aaabbbccc";
        HashMap<Character, Integer> hm = new HashMap();
        char[] var6;
        int var5 = (var6 = word.toCharArray()).length;

        for(int var4 = 0; var4 < var5; ++var4) {
            Character c = var6[var4];
            Integer integer = (Integer)hm.get(c);
            if (integer == null) {
                hm.put(c, 1);
            } else {
                hm.put(c, (Integer)hm.get(c) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.print("" + entry.getKey() + entry.getValue());
        }

    }
}
