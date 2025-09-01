package Collections;

public class avaStreamMethodsOnString {
    public static void main(String[] args) {
        String reverse = "";
        String str = "cts cts is mnc mnc companay";
        String[] arr = str.split("\\s");

        for(int i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }

        for(int i = str.length() - 1; i >= 0; --i) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}