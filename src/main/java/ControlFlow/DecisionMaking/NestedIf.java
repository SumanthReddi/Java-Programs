package ControlFlow.DecisionMaking;

public class NestedIf {
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        // Outer if condition
        if (a == 10) {

            // Inner if condition
            if (b == 20) {
                System.out.println("Inner If Executed");
            }
        }
    }
}
