package Lesson01.lab02;

import java.util.Scanner;

public class lab02_01 {
    private String name, address;
    private double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên:");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        address = sc.nextLine();
        System.out.println("Nhập lương: ");
        salary = sc.nextDouble();
    }
    public void view(){
        System.out.println("Tên: "+name+ "\nĐịa chỉ: "+address+ "\nLương: "+salary);
    }

    public static void main(String[] args) {
        lab02_01 person = new lab02_01();
        person.input();
        person.view();
    }
}
