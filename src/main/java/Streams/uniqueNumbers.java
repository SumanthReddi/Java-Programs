
package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueNumbers {
    public static void main(String[] args) {
        List<Integer> nb = Arrays.asList(4, 4, 3, 2, 0, 7, 1, 0, 6, 5, 4, 3, 2, 1, 0);
        List<Integer> uniqueNumber = (List)nb.stream().distinct().sorted().collect(Collectors.toList());
        Iterator<Integer> itn = uniqueNumber.iterator();

        while(itn.hasNext()) {
            System.out.print(itn.next() + " ");
        }

    }
}
