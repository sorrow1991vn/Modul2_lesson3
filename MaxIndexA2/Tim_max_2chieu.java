package Lesson3.MaxIndexA2;

import java.util.Scanner;

public class Tim_max_2chieu {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran:");
        n = sc.nextInt();
        System.out.println("Nhap vao so cot cua ma tran:");
        m = sc.nextInt();
        int[][] A = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Nhap phan tu thu A[" + (i + 1) + "][" + (j + 1) + "]=");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran nhap vao: ");
        intMT(A,n,m);
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (A[i][j] == findMax(A,n,m)){
                    System.out.println("\n Phan tu o hang "+i+" cot "+j+" dat Max: A["+i+"]["+j+"]= "+A[i][j]);
                }
            }
        }
    }

    public static void intMT(int[][] A, int n, int m) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.println("\n");
            for (j = 0; j < m; j++) {
                System.out.print(" " + A[i][j]);
            }
        }
    }

    public static int findMax(int[][] A, int n, int m) {
        int Max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Max < A[i][j]) {
                    Max = A[i][j];
                }
            }
        }return (Max);
    }
}
