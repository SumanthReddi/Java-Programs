package InterviewQuestions;
import java.util.ArrayList;
import java.util.HashSet;

public class PrintSumOfUniqueNumbersFromArrayList {
        public static void main(String[] args) {
            // Define two ArrayLists
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            // Add elements to list1 and list2
            list1.add(10);
            list1.add(20);
            list1.add(33);
            list1.add(40);

            list2.add(13);
            list2.add(20);
            list2.add(30);
            list2.add(53);

            // Find unique numbers that add up to 53
            HashSet<String> uniquePairs = new HashSet<>();

            for (int num1 : list1) {
                for (int num2 : list2) {
                    if (num1 + num2 == 53) {
                        // Format pair as a string to ensure uniqueness
                        uniquePairs.add(num1 + "," + num2);
                    }
                }
            }

            // Print the unique pairs
            System.out.println("Unique pairs whose sum is 53:");
            for (String pair : uniquePairs) {
                System.out.println(pair);
            }
        }
    }