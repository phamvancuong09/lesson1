package Lesson01.lab02;

import java.util.Scanner;

public class lab02_ThucHanh1 {
    String name, address, gioiTinh;
    int soLanThi;
    float diemThiJava;
    double lePhiThi;

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ thường trú: ");
        address = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập lệ phí đóng thi lại: ");
        lePhiThi = sc.nextDouble();
        System.out.println("Nhập diem thi môn java: ");
        diemThiJava = sc.nextFloat();
        if(gioiTinh.equals("Nam")){
            gioiTinh = "M";
        }
        else if(gioiTinh.equals("Nữ")){
            gioiTinh = "F";
        }
    }

    public static void main(String[] args) {
        lab02_ThucHanh1 sinhvien = new lab02_ThucHanh1();
        sinhvien.NhapThongTin();
        System.out.println("Thông tin của sinh viên :" + "\n Tên sinh viên: "+sinhvien.name+
                "\n Địa chỉ sinh viên: "+sinhvien.address+
                "\n giới tính: "+sinhvien.gioiTinh+
                "\n lệ phí đóng thi lại sinh viên: "+sinhvien.lePhiThi+
                "\n Điểm thi môn java của sinh viên: "+sinhvien.diemThiJava);
    }

}
