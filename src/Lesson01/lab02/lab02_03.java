package Lesson01.lab02;

import java.util.Scanner;

public class lab02_03 {
    private String maSV, tenSV;
    private float diemLT, diemTH;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        diemLT = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        diemTH = sc.nextFloat();
    }

    public void view(){
        double diemTB = (diemLT + diemTH)/2;
        System.out.println("======Thông tin sinh viên=====" +
                "\n Mã sinh viên: "+maSV+
                "\n Tên sinh viên: "+tenSV+
                "\n Điểm lý thuyết: "+diemLT+
                "\n Điểm thực hành: "+diemTH+
                "\n Điểm trung bình:"+diemTB);
        if(diemLT < 4){
            System.out.println("Thi lại lý thuyết");
        }
        else {
            System.out.println("Qua môn lý thuyết");
        }

        if(diemTH < 4){
            System.out.println("Thi lại thực hành");
        }
        else {
            System.out.println("Qua môn thực hành");
        }

        if(diemTB < 4){
            System.out.println("Sinh viên phải học lại");
        }
        else if(diemTB >=4 && diemTB <=7){
            System.out.println("Sinh viên đạt môn java");
        }
        else{
            System.out.println("Sinh viên xuất sắc môn java");
        }
    }

    public static void main(String[] args) {
        lab02_03 sinhVien = new lab02_03();
        sinhVien.input();
        sinhVien.view();
    }
}
