
package Random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "est";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.println(str1);
        System.out.println(str2);
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if (Arrays.equals(string1, string2)) {
                System.out.println("Strings are Anagram");
            }
        }

        Integer[] arr = new Integer[]{1, 3, 6, 5, 2, 6};
        List<Integer> num = new LinkedList();
        Set<Integer> num2 = new TreeSet(Comparator.reverseOrder());

        for(int i = 0; i < arr.length; ++i) {
            num.add(arr[i]);
            num2.add(arr[i]);
        }

        System.out.println(num);
        System.out.println(num2);
    }
}
