
package Random;

public class SplitAlphaNumeric {
    public static StringBuffer splitAlphaNumeric(String str) {
        str = str.replaceAll(" ", "");
        StringBuffer alpha = new StringBuffer();
        StringBuffer num = new StringBuffer();
        StringBuffer special = new StringBuffer();

        for(int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else if (Character.isAlphabetic(str.charAt(i))) {
                alpha.append(str.charAt(i));
            } else {
                special.append(str.charAt(i));
            }
        }

        return special;
    }

    public static void main(String[] args) {
        StringBuffer num = splitAlphaNumeric("geeks01for 02geeks*&^%!34");
        System.out.println(num);
    }
}
