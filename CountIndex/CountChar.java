package Lesson3.CountIndex;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("Ky tu: ");
        char c;
        c = sc.next().charAt(0);
        int count = 0;
        for (int i=0;i<s.length();i++){
             if( s.charAt(i) == c){
                 count++;
             }
        }
        System.out.println("So lan xuat hien cua " + c + " la " + count);
    }
}
