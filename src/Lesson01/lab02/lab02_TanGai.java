package Lesson01.lab02;

import java.util.Scanner;

public class lab02_TanGai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Chương trình tán gái có chọn lọc ===");
        System.out.println("Nhập các thông tin của nàng:");

        // Nhập các thông tin của cô gái
        System.out.print("Gái xinh hay xấu (nhập 'xinh' hoặc 'xấu'): ");
        String veBeNgoai = scanner.nextLine();

        if (veBeNgoai.equals("xinh")) {
            System.out.print("Gái đã có người yêu chưa (nhập 'có' hoặc 'chưa'): ");
            String coNguoiYeu = scanner.nextLine();

            if (coNguoiYeu.equals("có")) {
                System.out.println("Chuyện nhỏ! Tán luôn bạn trai của nàng để cạnh tranh!");
            } else {
                System.out.println("Nàng chưa có người yêu, tán ngay thôi!");
                System.out.print("Nàng đồng ý làm người yêu hoặc không! Nhập 'đồng ý' hoặc 'không': ");
                String lamNguoiYeu = scanner.nextLine();
                if(lamNguoiYeu.equals("đồng ý")){
                    System.out.println("Đưa nàng đi ăn, đi chơi...");
                } else {
                    System.out.println("Cho nó sang kiếp khác!");
                }
            }
        } else if (veBeNgoai.equals("xấu")) {
            System.out.print("Nhà nàng có mặt phố không (nhập 'có' hoặc 'không'): ");
            String nhaMatPho = scanner.nextLine();
            System.out.print("Bố nàng có làm to không (nhập 'có' hoặc 'không'): ");
            String boLamTo = scanner.nextLine();

            if (nhaMatPho.equals("có") || boLamTo.equals("có")) {
                System.out.println("Nhắm mắt mà tán thôi! Tình yêu không có biên giới.");
            } else {
                System.out.println("Chuyển ngay cho thằng trọ cùng phòng!");
            }
        } else {
            System.out.println("Bạn đã nhập sai thông tin. Vui lòng nhập lại!");
        }

    }
}
