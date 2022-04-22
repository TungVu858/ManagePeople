package ql_thisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();

        int choice = -1;
        int sBD;
        String name;
        String adress;
        int uuTien;
        while (choice != 0) {
            System.out.println("1.Thêm thí sinh ");
            System.out.println("2.Hiển thị thí sinh");
            System.out.println("3.Tìm SBD thí sinh");
            System.out.println("0.Thoát ");
            System.out.print("Nhập lựa chọn : ");
            choice = checkException(scs);
            switch (choice) {
                case 1:
                    int choice_1 = -1;
                    while (choice_1 != 0) {
                        System.out.println("1.Nhập thí sinh khối A");
                        System.out.println("2.Nhập thí sinh Khối B");
                        System.out.println("3.Nhập thí sinh khối C");
                        System.out.println("0.Thoát");
                        System.out.print("Nhập lựa chọn : ");
                        choice_1 = checkException(scs);
                        switch (choice_1) {
                            case 1:
                                System.out.println("Nhập thí sinh khối A : ");
                                sBD = checkExceptionNumber("Nhập SBD : ");
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                uuTien = checkExceptionNumber("Nhập độ ưu tiên : ");
                                tuyenSinh.add(new KhoiA(sBD, name, adress, uuTien));
                                break;
                            case 2:
                                System.out.println("Nhập thí sinh khối B : ");
                                sBD = checkExceptionNumber("Nhập SBD : ");
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                uuTien = checkExceptionNumber("Nhập độ ưu tiên : ");
                                tuyenSinh.add(new KhoiB(sBD, name, adress, uuTien));


                                break;
                            case 3:
                                System.out.println("Nhập thí sinh khối C : ");
                                sBD = checkExceptionNumber("Nhập SBD : ");
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                uuTien = checkExceptionNumber("Nhập độ ưu tiên : ");
                                tuyenSinh.add(new KhoiC(sBD, name, adress, uuTien));
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thông tin các thí sinh !");
                    tuyenSinh.display();
                    break;
                case 3:
                    System.out.println("Nhập SBD cần tìm : ");
                    sBD = scs.nextInt();
                    tuyenSinh.findById(sBD);
                    break;
            }
        }
        tuyenSinh.add(new KhoiA(123, "Vũ Thanh Tùng", "HN", 2));
        tuyenSinh.add(new KhoiB(555, "Ngô Việt Hoàng", "HN", 1));
        tuyenSinh.display();
        tuyenSinh.findById(555);
    }

    private static int checkException(Scanner scs) {
        int choice;
        try {
            choice = scs.nextInt();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Chỉ được nhập số " + ANSI_RESET);
            scs.nextLine();
            choice = -1;
        }
        return choice;
    }

    private static int checkExceptionNumber(String message) {
        boolean check = false;
        int choice = 0 ;
        Scanner scs = new Scanner(System.in);
        while (!check) {
            try {
                System.out.println(message);
                choice = scs.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println(ANSI_RED+"Chỉ được nhập số!"+ANSI_RESET);
                scs.nextLine();
                check = false;
            }
        }
        return choice;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
