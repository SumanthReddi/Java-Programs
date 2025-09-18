package ControlFlow.DecisionMaking;

public class Ternary {
    public static void main(String[] args) {

        // Example 1: Simple usage
        int a = 10, b = 20;
        int max = (a > b) ? a : b;   // checks if a > b
        System.out.println("Maximum is: " + max);

        // Example 2: With Strings
        int age = 18;

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);

        // Example 3: Nested Ternary (multiple conditions)
        int number = 0;

        String type = (number > 0) ? "Positive" :
                      (number < 0) ? "Negative" : "Zero";

        System.out.println("Number is: " + type);
    }
}
