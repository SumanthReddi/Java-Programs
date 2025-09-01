//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Collections;

public class interview {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                ++count;
                System.out.print(count + " ");
            }

            System.out.println();
        }

    }
}
