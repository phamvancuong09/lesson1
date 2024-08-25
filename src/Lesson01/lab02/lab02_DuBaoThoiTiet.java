package Lesson01.lab02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab02_DuBaoThoiTiet {
    int chon;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Chương trình dự báo thời tiết theo con chuồn chuồn=========="+
                "\n 1. Bay thấp"+
                "\n 2. Bay cao"+
                "\n 3. Bay vừa");
        System.out.println("Nhập lựa chọn của bạn:");
        chon = sc.nextInt();
        System.out.println("Cảm ơn bạn đã chọn!");
    }

    public  void HienThi(){
        switch (chon){
            case 1:
                System.out.println("Dự báo thời tiết có mưa, đề nghị bạn ra đường nên mang theo áo mưa hay ô dù!");
                break;
            case 2:
                System.out.println("Dự báo thời tiết hôm nay trời nắng nóng, nhiệt độ vào khoảng 39-42 độ, xin quý khách ở yên trong nhà!");
                break;
            case 3:
                System.out.println("Dự báo thời tiết mát mẻ, phù hợp đi thả diều bạn nhé");
                break;
            default:
                System.out.println("Lỗi chọn: 404 !");
                break;
        }
    }

    public static void main(String[] args) {
        lab02_DuBaoThoiTiet duBaoThoiTiet = new lab02_DuBaoThoiTiet();
        duBaoThoiTiet.Nhap();
        duBaoThoiTiet.HienThi();
    }
}
