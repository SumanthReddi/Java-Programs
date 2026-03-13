package InterviewQuestions;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        int temp;
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length - 1; k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        for (int m = 0; m < a.length; m++) {
            System.out.println("a[" + m + "]= " + a[m]);

            /* Using Arrays.sort() method
            Arrays.sort(arr);
            for(int num : arr){
            System.out.print(num + " ");
             */
        }
    }
}