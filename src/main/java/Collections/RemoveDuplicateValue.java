package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValue {
    public static void main(String[] args) {
        String word = "aabbaabcccc";
        String[] str = word.split("");
        Set<String> unique = new LinkedHashSet();

        for(String s : str) {
            unique.add(s);
            System.out.println(s);
        }

        System.out.println(unique);
    }
}
