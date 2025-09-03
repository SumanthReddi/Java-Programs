package ControlFlow.DecisionMaking;

public class ifElseIfLadder {
    public static void main(String[] args){
        int marks=70;
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        System.out.println("Qualified Grade : "+grade);
    }
}

