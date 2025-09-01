
package Random;

public class ReplaceAllNumericDigitBySpaces {
    public static void main(String[] args) {
        String str1 = "Java$123is456@fun";
        String str = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
