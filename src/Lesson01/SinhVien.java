package Lesson01;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        String hoTen;
        int tuoi;
        float diemLyThuyet, diemThucHanh;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ và tên:");
        hoTen = sc.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi = sc.nextInt();
        System.out.println("Nhập điểm lý thuyết:");
        diemLyThuyet = sc.nextFloat();
        System.out.println("Nhập điểm thực hành:");
        diemThucHanh = sc.nextFloat();

        float diemTB = (diemLyThuyet + diemThucHanh)/2;

        System.out.println("Ten: " +hoTen+ "\nTuổi: " +tuoi+ "\nĐiểm trung bình: "+diemTB);
    }
}
