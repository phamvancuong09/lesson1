package Lesson01;

import java.util.Scanner;

public class lab01_10 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a=");
        a = sc.nextFloat();
        System.out.println("Nhap b=");
        b = sc.nextFloat();
        System.out.println("Nhap c=");
        c = sc.nextFloat();
        if(a == 0){
            if(b == 0){
                if(c==0){
                    System.out.println("Phương trình có vô số nghiệm");
                }
                else{
                    System.out.println("Phương trình  vô nghiệm");
                }
            }
            else{
                System.out.println("Phương trình có 1 nghiệm duy nhất"+(-c)/b);
            }
        }
        else{
            double delta = Math.pow(b,2) - 4*a*c;
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }
            else if(delta == 0){
                System.out.println("Phương trình có nghiệm kép: "+(-b)/(2*a));
            }
            else {
                System.out.println("Phương trình có 2 nghiệm :"+"\nx1 = "+((-b + (Math.sqrt(delta)))/2*a) + "\nx2 = " +((-b - (Math.sqrt(delta)))/2*a));
            }
        }
    }
}
