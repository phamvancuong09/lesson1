package Lesson01;

import java.util.Scanner;

public class lab01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap du lieu
        System.out.println("Nhập số nguyên n:");
        int n = sc.nextInt();
        System.out.println("Nhập số nguyen m :");
        int m = sc.nextInt();
        System.out.println("số nguyên ="+n+ "\nsố thực ="+m+ "\nTong (m + n) = "+(m+n));
    }
}
