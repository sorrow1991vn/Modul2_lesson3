package Lesson3.SumDiagA2;

import java.util.Scanner;

public class SumDiag {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang: ");
        n = sc.nextInt();
        System.out.println("Nhap vao so cot cua mang: ");
        m = sc.nextInt();
        int[][] A = new int[n][m];
        System.out.println("Nhap phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += A[j][j];
                }
            }
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tong cac so o duong cheo la: " + sum);
    }
}
