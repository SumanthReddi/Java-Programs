
package Random;

public class ReverseStringUsingCharArray {
    public static void main(String[] args) {
        String str = "Saket Saurav";
        String rev = "";
        char[] chars = str.toCharArray();
        System.out.println(chars[1]);

        for(int i = chars.length - 1; i >= 0; --i) {
            rev = rev + chars[i];
        }

        System.out.println(rev);
    }
}
