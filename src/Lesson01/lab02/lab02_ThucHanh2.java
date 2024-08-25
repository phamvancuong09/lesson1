package Lesson01.lab02;

import java.util.Scanner;

public class lab02_ThucHanh2 {
    float a,b;
    public void nhap(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhap a=");
        a = sc.nextFloat();
        System.out.println("Nhap b=");
        b = sc.nextFloat();
    }
    public double tong(){
        return a+b;
    }
    public double hieu(){
        return a-b;
    }
    public double tich(){
        return a*b;
    }
    public double thuong(){
        return (a/b);
    }

    public static void main(String[] args) {
        lab02_ThucHanh2 mayTinh = new lab02_ThucHanh2();
        mayTinh.nhap();
        System.out.println("Phep Cong la: "+mayTinh.tong() + "\nPhep tru la: "+mayTinh.hieu()+"\nPhep nhan la: "+mayTinh.tich()+ "\nPhep chia la: "+mayTinh.thuong() );
    }

}
