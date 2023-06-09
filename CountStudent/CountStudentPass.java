package Lesson3.CountStudent;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter the mark for student" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
