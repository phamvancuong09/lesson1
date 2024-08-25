package Lesson01.lab02;

import java.util.Scanner;

public class lab02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên 1:");
        int n1 = sc.nextInt();
        System.out.println("Nhập số nguyên 2:");
        int n2 = sc.nextInt();
        System.out.println("Nhập số nguyên 3:");
        int n3 = sc.nextInt();
        System.out.println("Nhập số nguyên 4:");
        int n4 = sc.nextInt();

        int max1 = Math.max(n1, n2);
        int max2 = Math.max(n3, n4);
        int max = Math.max(max1, max2);

        System.out.println("Số lớn nhất : "+max);
    }
}
