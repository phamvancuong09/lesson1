package Lesson01;

import java.util.Scanner;

public class lab01_08 {
    public static void main(String[] args) {
        // khai báo biến
        int num1, num2,num3, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập num1: ");
        num1 = sc.nextInt();
        System.out.println("Nhập num2: ");
        num2 = sc.nextInt();
        System.out.println("Nhập num3: ");
        num3 = sc.nextInt();
        // tìm max , min
        if((num1 > num2) && (num2 > num3) && (num1>num3)){
            max = num1;
            min = num3;
        }else if((num1 > num2) && (num2 < num3) && (num1>num3)){
            max = num1;
            min = num3;
        }else if((num1 < num2) && (num2 > num3) && (num1<num3)){
            max = num2;
            min = num1;
        }else{
            max = num3;
            min = num1;
        }
//        max=Math.max(num1,Math.max(num2, num3));
//        int min1 = (num1>num2)?num2:num1;
//        min = (min1 > num3)?num3:min1;
        System.out.println("\n Max="+ max + "\n Min ="+min);
    }
}
