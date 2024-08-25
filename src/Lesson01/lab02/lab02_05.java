package Lesson01.lab02;

import java.util.Scanner;

public class lab02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N = ");
        int n = sc.nextInt();

        if(n % 2 == 0 && n != 0){
            System.out.println("là số chẵn!");
        }
        else if(n % 2 != 0 && n !=0){
            System.out.println("là số lẻ!");
        }
        else{
            System.out.println("số vô định");
        }
    }
}
