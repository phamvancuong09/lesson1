package Lesson01.lab02;

import java.util.Scanner;

public class lab02_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int thang = sc.nextInt();
        switch (thang){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Có 30 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                System.out.println("Nhập năm: ");
                int nam = sc.nextInt();
                if(nam % 4 == 0 && nam % 100 !=0 || nam % 400 ==0){
                    System.out.println("Tháng 2 có 29 ngày");
                }else{
                    System.out.println("Tháng 2 có 28 ngày");
                }
                break;
            default:
                System.out.println("Bạn nhập không đúng!");

        }
    }

}
