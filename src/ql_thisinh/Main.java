package ql_thisinh;

import mini_qlsv.QuanLyUser;
import mini_qlsv.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        QuanLyUser quanLyUser = new QuanLyUser();
        int choice = -1;
        int sBD;
        String name;
        String adress;
        String pass;
        int uuTien;
        while (choice != 0) {
            System.out.println("1.Đăng Nhập");
            System.out.println("2.Đăng Kí");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chọn : ");
            choice = checkException(scs);
            switch (choice) {
                case 1:
                    System.out.println("Chào mừng bạn đến với màn hình đăng nhập ");
                    System.out.println("Nhập username : ");
                    name = scc.nextLine();
                    System.out.println("Nhập userpass : ");
                    pass = scc.nextLine();
                    if (quanLyUser.find(name, pass) != -1) {
                        System.out.println("Bạn đăng nhập thành công ");
                        System.out.println("-------------------------- ");
                        System.out.println(quanLyUser.display(name, pass));
                        int choice_2 = -1;
                        while (choice_2 != 0) {
                            System.out.println("1.Thêm thí sinh ");
                            System.out.println("2.Hiển thị thí sinh");
                            System.out.println("3.Tìm SBD thí sinh");
                            System.out.println("4.Đổi mật khẩu ");
                            System.out.println("0.Thoát ");
                            System.out.print("Nhập lựa chọn : ");
                            choice_2 = checkException(scs);
                            switch (choice_2) {
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
                                    sBD = checkExceptionNumber("Nhập SBD cần tìm : ");
                                    tuyenSinh.findById(sBD);
                                    break;
                                case 4:
                                    System.out.println("Thông tin tài khoản của bạn : ");
                                    quanLyUser.displayInfor(name, pass);
                                    while (choice != 2) {
                                        System.out.println("1.Đổi mật khẩu ");
                                        System.out.println("2.Thoát");
                                        choice = checkException(scs);
                                        if (choice == 1) {
                                            User user1 = new User();
                                            user1.setUsername(name);
                                            String oldPass = pass;
                                            System.out.println("Nhập mật khẩu mới : ");
                                            pass = scc.nextLine();
                                            user1.setUserpass(pass);
                                            quanLyUser.edit(name, oldPass, user1);
                                            System.out.println("Bạn đã thay đổi mật khẩu thành công :");
                                        }
                                    }
                                    break;
                            }
                        }
                    } else System.out.println("Bạn nhập sai tk hoặc mk !");
                    break;
                case 2:
                    int choice_3 = -1;
                    while (choice_3 != 0) {
                        System.out.println("Chào mừng bạn đến với màn hình đăng kí ");
                        System.out.println("1.Tạo tài khoản!");
                        System.out.println("0.Thoát");
                        System.out.println("Nhập lựa chọn : ");
                       choice_3 = checkException(scs);
                        if (choice_3 == 1) {
                            System.out.println("Nhập username ");
                            name = scc.nextLine();
                            System.out.println("Nhập userpass");
                            pass = scc.nextLine();
                            System.out.println("Nhập lại userpass");
                            String repass = scc.nextLine();
                            if (pass.equals(repass)) {
                                quanLyUser.add(new User(name, pass));
                            } else {
                                System.out.println("Bạn cần nhập 2 mật khẩu trùng nhau !");
                            }
                        }
                    }
            }
        }

    }

    private static int checkException(Scanner scs) {
        int choice;
        try {
            choice = scs.nextInt();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Chỉ được nhập số !!!!" + ANSI_RESET);
            scs.nextLine();
            choice = -1;
        }
        return choice;
    }

    private static int checkExceptionNumber(String message) {
        int choice = -1 ;
        Scanner scs = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println(message);
                choice = scs.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println(ANSI_RED+"Chỉ được nhập số !!!!!"+ANSI_RESET);
                scs.nextLine();
            }
        }
        return choice;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
