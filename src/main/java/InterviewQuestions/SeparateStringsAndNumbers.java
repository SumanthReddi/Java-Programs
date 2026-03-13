package InterviewQuestions;
import java.util.ArrayList;
import java.util.List;

public class SeparateStringsAndNumbers {
    public static void main(String[] args) {
        // Example object array
        Object[] array = {1, "hello", 42, "world", 3.14, "Java", 7};

        // Separate lists for strings and numbers
        List<String> strings = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

        // Iterate through the array
        for (Object obj : array) {
            if (obj instanceof String) {
                strings.add((String) obj);
            } else if (obj instanceof Number) {
                numbers.add((Number) obj);
            }
        }

        // Print the results
        System.out.println("Strings: " + strings);
        System.out.println("Numbers: " + numbers);
    }

}