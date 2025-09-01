//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFrequencyMethod {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{20, 10, 9, 20, 8, 7, 10, 12, 20, 9, 12};
        Integer[] var5 = arr;
        int var4 = arr.length;

        for(int var3 = 0; var3 < var4; ++var3) {
            int num = var5[var3];
            System.out.println(num);
        }

        System.out.println("************************");
        Arrays.sort(arr);
        var5 = arr;
        var4 = arr.length;

        for(int var8 = 0; var8 < var4; ++var8) {
            int sortnum = var5[var8];
            System.out.println(sortnum);
        }

        System.out.println("************************");
        List<Integer> numbers = Arrays.asList(arr);

        for(int number : numbers) {
            if (Collections.frequency(numbers, number) == 1) {
                System.out.println("first unique number is " + number);
                break;
            }
        }

    }
}
