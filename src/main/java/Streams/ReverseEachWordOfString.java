
package Streams;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "WELCOME TO JAVA";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; --i) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
        String[] words = rev.split(" ");

        for(int i = words.length - 1; i >= 0; --i) {
            System.out.print(words[i] + " ");
        }

    }
}
