package Random;
public class CountIndividualVowels {

    public static void main(String[] args) {
        String str = "Automation Testing".toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            switch (ch) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("a : " + a);
        System.out.println("e : " + e);
        System.out.println("i : " + i);
        System.out.println("o : " + o);
        System.out.println("u : " + u);
    }
}