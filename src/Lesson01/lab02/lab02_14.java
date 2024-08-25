package Lesson01.lab02;

import java.util.Scanner;

public class lab02_14 {
    public static void main(String[] args) {
        final int tienThueBao = 1000;
        final int dinhMucKW = 50;
        final int giaDinhMuc = 230;

        // nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số điện cũ: ");
        int chiSoDienCu = sc.nextInt();
        System.out.println("Nhập chỉ số điện mới: ");
        int chiSoDienMoi = sc.nextInt();

        // kiểm tra chỉ số mới không được < chỉ số cũ
        if(chiSoDienCu > chiSoDienMoi){
            System.out.println("Chỉ số điện cũ không được lớn hơn chỉ số điện mới");
        }

        int luongDienTieuThu = chiSoDienMoi - chiSoDienCu;

        int tienTraDinhMuc = dinhMucKW * giaDinhMuc;

        int luongDienVuotDinhMuc = luongDienTieuThu - dinhMucKW;

        int tienDienVuotDinhMuc = 0;
        if(luongDienVuotDinhMuc > 0){
            if(luongDienVuotDinhMuc <= 50){
                tienDienVuotDinhMuc = luongDienVuotDinhMuc * 480;
            } else if (luongDienVuotDinhMuc > 50 && luongDienVuotDinhMuc < 100) {
                tienDienVuotDinhMuc = (50 * 480) + (luongDienVuotDinhMuc - 50) * 700;
            }
            else {
                tienDienVuotDinhMuc = (50 * 480) + (50 * 700) + (luongDienVuotDinhMuc - 100)* 900;
            }
        }

        int tongTienPhaiTra = tienTraDinhMuc + tienDienVuotDinhMuc + tienThueBao;

        System.out.println("Chỉ số cũ: "+chiSoDienCu);
        System.out.println("Chỉ số mới: "+chiSoDienMoi);
        System.out.println("Tiền trả định mức: "+tienTraDinhMuc);
        System.out.println("Tiền trả vượt định mức: "+tienDienVuotDinhMuc);
        System.out.println("Tổng tiền phải trả: "+tongTienPhaiTra);
    }
}
