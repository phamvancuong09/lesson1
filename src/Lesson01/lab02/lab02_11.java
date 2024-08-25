package Lesson01.lab02;

import java.util.Scanner;

public class lab02_11 {
    float x, y;
    String toanTu;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x = ");
        x = sc.nextFloat();
        System.out.println("Nhập y = ");
        y = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập toán tử = ");
        toanTu = sc.nextLine();
    }

    public void HienThi(){
        if(toanTu.equals("+")){
            System.out.printf("Tổng %f + %f = %f",x,y,x+y);
        }
        else if(toanTu.equals("-")){
            System.out.printf("Hiệu %f - %f = %f",x,y,x-y);
        }
        else if(toanTu.equals("*")){
            System.out.printf("Tích %f * %f = %f",x,y,x*y);
        }
        else if(toanTu.equals("/")){
            if(y == 0){
                System.out.println("Không chia được");
            }
            else{
                System.out.printf("Thương %f / %f = %f",x,y,x/y);
            }

        }
    }

    public static void main(String[] args) {
        lab02_11 tinhToan = new lab02_11();
        tinhToan.nhap();
        tinhToan.HienThi();
    }
}
