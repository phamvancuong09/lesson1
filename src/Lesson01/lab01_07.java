package Lesson01;

import java.util.Scanner;

public class lab01_07 {
    public static void main(String[] args) {
        // khai báo biến
        int num1, num2, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập num1: ");
        num1 = sc.nextInt();
        System.out.println("Nhập num2: ");
        num2 = sc.nextInt();
        // tìm max , min
        if(num1 > num2){
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        }
        max=(num1>num2)?num1:num2;
        min=(num1>num2)?num2:num1;
        System.out.println("\n Max="+ max + "\n Min ="+min);

    }
}
