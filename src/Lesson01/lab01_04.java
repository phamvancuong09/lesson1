package Lesson01;

import java.util.Scanner;

public class lab01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap du lieu
        System.out.println("Nhập số nguyên :");
        int n = sc.nextInt();
        System.out.println("Nhập số thực :");
        float m = sc.nextFloat();
        System.out.println("Nhập xâu ky tu :");
        String kiTu = sc.nextLine();
        System.out.println("số nguyên ="+n+ "\nsố thực ="+m+ "Xâu ký tự:"+kiTu);
    }
}
