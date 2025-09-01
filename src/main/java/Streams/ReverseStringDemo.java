
package Streams;

public class ReverseStringDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 3, 5};
        int temp = 0;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int[] var6 = arr;
        int var5 = arr.length;

        for(int var9 = 0; var9 < var5; ++var9) {
            Integer i = var6[var9];
            System.out.print(i + " ");
        }

    }
}
