
package Random;

import java.util.Scanner;

public class ReverseStringUsingChartAtMethod {
    public static void main(String[] args) {
        String reverse = "";
        System.out.println("Enter the string to be reversed");
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();
        int length = original.length();

        for(int i = length - 1; i >= 0; --i) {
            reverse = reverse + original.charAt(i);
//            System.out.println(reverse);
        }

        System.out.println(reverse);
    }
}
