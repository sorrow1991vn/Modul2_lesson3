package Lesson3.AddIndex;

import java.util.Arrays;

public class Them_phan_tu {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Mang ban dau la : " + Arrays.toString(arr));
        addIndex(arr, 9, 19);
        System.out.println("Mang da them phan tu la: " + Arrays.toString(arr));

    }

    public static void addIndex(int[] arr, int index, int x) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
    }
}
