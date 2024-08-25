package Lesson01.lab02;

import java.util.Scanner;

public class lab02_10 {
    public static void main(String[] args) {
       String color = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biến ký tự: ");
        color = sc.nextLine();
       if(color.equals("R") || color.equals("r")) {
           System.out.println("RED");
       }else if(color.equals("G") || color.equals("g")){
           System.out.println("GREEN");
       } else if (color.equals("B") || color.equals("b")) {
           System.out.println("BLUE");
       }else {
           System.out.println("BLACK");
       }
    }
}
