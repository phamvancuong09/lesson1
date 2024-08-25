package Lesson01.lab02;

import java.util.Random;
import java.util.Scanner;

public class lab02_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Các lựa chọn của trò chơi
        String[] luaChonTroChoi = {"keo", "bua", "bao"};

        // Người chơi chọn
        System.out.print("Nhập lựa chọn của bạn (keo, bua, bao): ");
        String nguoiDungNhap = scanner.nextLine().toLowerCase();

        // Kiểm tra đầu vào hợp lệ
        while (!nguoiDungNhap.equals("keo") && !nguoiDungNhap.equals("bua") && !nguoiDungNhap.equals("bao")) {
            System.out.print("Lựa chọn không hợp lệ! Hãy nhập lại (keo, bua, bao): ");
            nguoiDungNhap = scanner.nextLine().toLowerCase();
        }

        // Máy tính chọn ngẫu nhiên
        String mayTinhChon = luaChonTroChoi[random.nextInt(3)];
        System.out.println("Máy tính chọn: " + mayTinhChon);

        // Xác định người chiến thắng bằng switch lồng nhau
        switch (nguoiDungNhap) {
            case "keo":
                switch (mayTinhChon) {
                    case "keo":
                        System.out.println("Hòa!");
                        break;
                    case "bua":
                        System.out.println("Bạn thua! Búa đập kéo.");
                        break;
                    case "bao":
                        System.out.println("Bạn thắng! Kéo cắt bao.");
                        break;
                }
                break;

            case "bua":
                switch (mayTinhChon) {
                    case "keo":
                        System.out.println("Bạn thắng! Búa đập kéo.");
                        break;
                    case "bua":
                        System.out.println("Hòa!");
                        break;
                    case "bao":
                        System.out.println("Bạn thua! Bao bọc búa.");
                        break;
                }
                break;

            case "bao":
                switch (mayTinhChon) {
                    case "keo":
                        System.out.println("Bạn thua! Kéo cắt bao.");
                        break;
                    case "bua":
                        System.out.println("Bạn thắng! Bao bọc búa.");
                        break;
                    case "bao":
                        System.out.println("Hòa!");
                        break;
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }

        scanner.close();
    }
}
