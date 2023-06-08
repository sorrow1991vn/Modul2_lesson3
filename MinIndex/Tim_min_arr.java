package Lesson3.MinIndex;

import java.net.BindException;
import java.util.Scanner;

public class Tim_min_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int Size;
        Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            System.out.print("Nhap phan tu cua mang: ");
            arr[i] = sc.nextInt();
        }
        int min = minArr(arr);
        System.out.println("Gia tri nho nhat cua mang la: " + arr[min] );
    }

    public static int minArr(int arr1[]) {
        int index = 0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[index]) {
                index = i;
            }
        }
        return index;
    }
}