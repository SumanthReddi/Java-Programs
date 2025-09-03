package ControlFlow.Loops;

public class DoWhile {
    public static void main(String[] args){
        int i=1;
        do { // Executes for one loop and then evaluate the expression to run for more loops.
            System.out.println(i);
            i++;
        }while(i<10);
    }
}

// One loop of executing is mandatory.