package test;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("*******************Menu*******************");
            System.out.println("------------------------------------------");
            String format = "|%1$-10s|%2$-30s|\n";
            System.out.format(format, "Lựa chọn", "Chức năng");
            System.out.println("------------------------------------------");
            System.out.format(format, "1", "Đăng nhập");
            System.out.format(format, "2", "Đăng ký");
            System.out.format(format, "3", "Quản lý ô tô");
            System.out.format(format, "4", "Quản lý xe máy");
            System.out.format(format, "0", "Thoát");
            System.out.println("------------------------------------------");
            System.out.println("|Nhập vào lựa chọn từ: 1-4, 0 để thoát!   |");
            System.out.println("------------------------------------------");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Chỉ được nhập số!");
                scanner.nextLine();
                choice = -1;
            }
            switch (choice){
                case 1:
                    System.out.println("Mời bạn đăng nhập");
                    break;
                case 2:
                    System.out.println("Mời bạn đăng ký");
                    break;
                case 3:
                    System.out.println("Danh sách Ô tô");
                    break;
                case 4:
                    System.out.println("Danh sách Xe máy");
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại!");
                    break;
            }
        }
    }
}
