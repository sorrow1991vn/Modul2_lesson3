package Lesson3.DeleteIndex;

import java.util.Arrays;

public class Xoa_phan_tu {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mang ban dau la: " + Arrays.toString(arr));
        deleteIndex(arr, 3);
        System.out.println("Mang da xoa phan tu la: " + Arrays.toString(arr));
    }

    public static void deleteIndex(int[] arr, int x) {
        for (int i = x; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
