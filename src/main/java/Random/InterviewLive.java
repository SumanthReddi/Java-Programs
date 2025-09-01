
package Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterviewLive {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{6, 4, 3, 2, 7, 0, 9, 1};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.binarySearch(arr, 9));
        List<Integer> numb = Arrays.asList(arr);
        Collections.sort(numb, Comparator.reverseOrder());
        System.out.println(numb.indexOf(7));
        System.out.println(numb.contains(9));
    }
}
