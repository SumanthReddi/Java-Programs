package InterviewQuestions;
import java.util.ArrayList;

public class SeparateEvenAndOddNumbersFromListandPrint {

    public static void main(String[] args) {
        int a[]= {2,5,6,8,9,3};

        ArrayList<Integer> even=new ArrayList();
        ArrayList<Integer> odd=new ArrayList();
        for(int i=0;i<a.length;i++) {
            if(a[i]%2==0) {
                even.add(a[i]);
            }
            else {
                odd.add(a[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

}