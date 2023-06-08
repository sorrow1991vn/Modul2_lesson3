package Lesson3.MergeArr;

import java.util.Arrays;

public class Gop_mang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9, 10};
        System.out.println("Hai mang ban dau la : ");
        System.out.println("Mang 1 : " + Arrays.toString(arr));
        System.out.println("Mang 2 : " + Arrays.toString(arr1));
        mergeArr(arr, arr1);
    }
    public static void mergeArr(int[] arr, int[] arr1) {
        int[] arr2 = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr.length + i] = arr1[i];
        }
        System.out.println("Mang da gop la : \n" + "Mang 3 : " + Arrays.toString(arr2));
    }
}