package Lesson01.lab02;

import java.util.Scanner;

public class lab02_12 {
    public static void main(String[] args) {
        float toan, ly, hoa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        toan = sc.nextFloat();
        System.out.println("Nhập điểm ly: ");
        ly = sc.nextFloat();
        System.out.println("Nhập điểm hoa: ");
        hoa = sc.nextFloat();

        double tongDiem = toan + ly + hoa;
        if(tongDiem >= 15 && (toan >= 4 && ly >= 4 && hoa >= 4)){
            System.out.println("Đậu");
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("\nHọc đều các môn");
            }else{
                System.out.println("Học chưa đều các môn");
            }
        }
        else{
            System.out.println("Thi hỏng!");
        }
    }
}
