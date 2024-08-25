package Lesson01.lab02;

import java.util.Scanner;

public class lab02_13 {
    public static void main(String[] args) {
        int soGio, luongGio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giờ làm: ");
        soGio = sc.nextInt();
        System.out.println("Nhập lương / 1h: ");
        luongGio = sc.nextInt();


        if(soGio > 40){
            // nếu số giờ lớn hơn 40, tính lưng cho 40 giờ đầu và số giờ vượt mức
            int gioLamThem = soGio - 40;
            double tongLuong = (40 * luongGio) + (gioLamThem * luongGio * 1.5);
            System.out.println("Tổng lương: "+tongLuong);
        }else{
            double tongLuong = soGio * luongGio;
            System.out.println("tổng lương: "+tongLuong);
        }
    }
}
