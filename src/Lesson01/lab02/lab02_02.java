package Lesson01.lab02;

import java.util.Scanner;

public class lab02_02 {
    String ten, nhaSanXuat;
    int soLuongBanhXe;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();
        System.out.println("Nhập số lượng bánh xe");
        soLuongBanhXe = sc.nextInt();
    }

    public void hienThiThongTin(){
        System.out.println("Tên: "+ten+ "\nNhà sản xuất: "+nhaSanXuat+ "\nsố lượng bánh xe: "+soLuongBanhXe);
    }

    public static void main(String[] args) {
        lab02_02 xeMay = new lab02_02();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();
    }
}
