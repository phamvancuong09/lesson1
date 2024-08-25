package Lesson01;

import java.util.Scanner;

public class lab1_06
{
    public static void main(String[] args) {
        // khai báo biến
        int n1,m1;
        float n2, m2;
        // nhập giá trị tu bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n1 = ");
        n1 = sc.nextInt();
        System.out.println("Nhập số nguyên m1 = ");
        m1 = sc.nextInt();
        System.out.println("Nhập số thực n2 = ");
        n2 = sc.nextFloat();
        System.out.println("Nhập số thực m2 = ");
        m2 = sc.nextFloat();

        int tongSoNguyen = n1+m1;
        float tongSoThuc = n2+m2;
        float tongN1N2 = (float)n1 + n2;

        System.out.printf("\n Tổng: %d + %d = %d", n1, m1, tongSoNguyen);
        System.out.printf("\n Tổng: %f + %f = %f", n2, m2, tongSoThuc);
        System.out.printf("\n Tổng: %d + %f = %f", n1, n2, tongN1N2);

    }
}
