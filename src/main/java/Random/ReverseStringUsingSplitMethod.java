package Random;

import java.util.Scanner;

public class ReverseStringUsingSplitMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = in.nextLine();
        String[] token = str.split("");

        for(int i = token.length - 1; i >= 0; --i) {
            System.out.print(token[i]);
        }

    }
}
