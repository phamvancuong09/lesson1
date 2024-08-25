package Lesson01;

import java.util.Scanner;

public class lab01_09 {
    // giải phương trình bậc 1 ax + b = 0
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a=");
        a = sc.nextFloat();
        System.out.println("Nhap b=");
        b = sc.nextFloat();

        if(a == 0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình  vô nghiệm");
            }
        }
        else{
            System.out.println("Phương trình có 1 nghiệm duy nhất"+(-b)/a);
        }
    }

}
