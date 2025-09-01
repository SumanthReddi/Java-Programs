package Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int l = 0;
        int h = arr.length - 1;
        boolean flag = false;

        while(l <= h) {
            int m = (l + h) / 2;
            if (key == arr[m]) {
                System.out.println("Element is found at : " + m);
                flag = true;
                break;
            }

            if (key > arr[m]) {
                l = m + 1;
            } else if (key < arr[m]) {
                h = m - 1;
            }
        }

        if (!flag) {
            System.out.println("Element is not found");
        }

    }
}
