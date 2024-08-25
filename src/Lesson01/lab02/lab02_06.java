package Lesson01.lab02;

import java.util.Scanner;

public class lab02_06 {
    public static void main(String[] args) {
        int a, b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a= ");
        a = sc.nextInt();
        System.out.println("Nhập số b= ");
        b = sc.nextInt();
        System.out.println("Nhập số c= ");
        c = sc.nextInt();

        if(((a+b)>c) && ((a+c)>b) && ((c+b)>a)){
            System.out.println("là tam giác");
        }
        else{
            System.out.println("không phải tam giác");
        }
    }
}
