package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamMethodsOnArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
        System.out.println(numbers);
        List<Integer> sortedArray = (List)numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedArray);
        List<Integer> reverseArray = (List)Stream.of(10, 100, 1, 1, 1, 2, 3, 4, 4, 5, 6).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseArray);
        System.out.println(reverseArray.get(1));
    }
}
