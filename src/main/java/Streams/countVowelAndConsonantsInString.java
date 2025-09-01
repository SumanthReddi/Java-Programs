
package Streams;

public class countVowelAndConsonantsInString {
    private static long VOWELS = 0L;
    private static long CONSONANTS = 0L;

    public static void main(String[] args) {
        String str = "Ne@eraj";
        System.out.println("Input String :- \n" + str);
        countVowelsAndConsonants(str);
        System.out.println("\nVowel count is = " + VOWELS);
        System.out.println("Consonant count is = " + CONSONANTS);
    }

    public static void countVowelsAndConsonants(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input String cannot be null");
        } else {
            str = str.replaceAll(" ", "");
            VOWELS = str.chars().filter((ch) -> 97 == ch || 101 == ch || 105 == ch || 111 == ch || 117 == ch || 65 == ch || 69 == ch || 73 == ch || 79 == ch || 85 == ch).count();
            CONSONANTS = str.chars().filter((ch) -> ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90).filter((ch) -> 97 != ch && 101 != ch && 105 != ch && 111 != ch && 117 != ch && 65 != ch && 69 != ch && 73 != ch && 79 != ch && 85 != ch).count();
        }
    }
}
