package ControlFlow.Loops;

public class NestedFor {
    public static void main(String[] args){
        for(int i=1;i<3;i++)
        {
            System.out.println("Outer Loops Started");
            for(int j=1;j<3;j++)
            {
                System.out.println("Inner Loop");
            }
            System.out.println("Outer Loops Ended");
        }
    }
}
