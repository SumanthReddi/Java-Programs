package ControlFlow.DecisionMaking;

public class Switch {
    public static void main(String[] args) {
        int dayOfWeek=1;
        switch (dayOfWeek) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Invalid day");
        }
    }
}
