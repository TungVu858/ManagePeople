package mini_qlsv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        QuanLyUser qluser = new QuanLyUser();
        Scanner scs = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        int num = -1;
        int id;
        String name;
        String pass;
        int age;
        int point;
        String flag;
        do {
            System.out.println("1.Đăng Nhập ");
            System.out.println("2.Đăng kí ");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chon : ");
            num = scs.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Mời bạn đăng nhập : ");
                    System.out.println("Nhập username : ");
                    name = scc.nextLine();
                    System.out.println("Nhập userpass : ");
                    pass = scc.nextLine();
                    if (qluser.find(name, pass) != -1) {
                        System.out.println("Bạn đăng nhập thành công ");
                        System.out.println("-------------------------- ");
                        System.out.println(qluser.display(name, pass));
                        do {
                            System.out.println("1.Vào trang quản lý : ");
                            System.out.println("2.Xem thông tin tài khoản : ");
                            System.out.println("3.Đăng xuất : ");
                            System.out.print("Nhập lựa chọn của bạn : ");
                            num = scs.nextInt();
                            switch (num) {
                                case 1:
                                    do {
                                        System.out.println("1.Thêm thông tin sinh viên");
                                        System.out.println("2.Sửa thông tin sinh viên");
                                        System.out.println("3.In thông tin sinh viên");
                                        System.out.println("4.Tìm thông tin sinh viên");
                                        System.out.println("5.Thoát");
                                        System.out.print("Nhập lựa chọn : ");
                                        num = scs.nextInt();
                                        switch (num) {
                                            case 1:
                                                do {
                                                    addSV(ql, scs, scc);
                                                    do {
                                                        System.out.println("Bạn muốn thêm tiếp không y/n");
                                                        flag = scc.nextLine();
                                                    } while (!flag.equals("y") && !flag.equals("n"));
                                                } while (flag.equals("y"));
                                                break;
                                            case 2:
                                                int id1;
                                                do {
                                                    System.out.println("Nhập id sinh viên cần sửa : ");
                                                    id1 = scs.nextInt();
                                                    int a = ql.find(id1);
                                                    if (a != -1) {
                                                        Student student = new Student();
                                                        System.out.println("Nhập vào thông tin sửa : ");
                                                        System.out.println("Nhập tên : ");
                                                        name = scc.nextLine();
                                                        student.setName(name);
                                                        System.out.println("Nhập tuổi : ");
                                                        age = scs.nextInt();
                                                        student.setAge(age);
                                                        System.out.println("Nhập điểm : ");
                                                        point = scs.nextInt();
                                                        student.setPoint(point);
                                                        student.setId(id1);
                                                        ql.edit(id1, student);
                                                    } else {
                                                        System.out.println("Không tìm thấy ID sinh viên ");
                                                    }
                                                    do {
                                                        System.out.println("Bạn muốn sửa tiếp không y/n");
                                                        flag = scc.nextLine();
                                                    } while (!flag.equals("y") && !flag.equals("n"));
                                                } while (flag.equals("y"));
                                                break;
                                            case 3:
                                                do {
                                                    System.out.println("Thông tin tất cả sinh viên : ");
                                                    ql.displayAll();
                                                    do {
                                                        System.out.println("Bạn muốn quay lại không y/n");
                                                        flag = scc.nextLine();
                                                    } while (!flag.equals("y") && !flag.equals("n"));
                                                }
                                                while (flag.equals("n"));
                                                break;
                                            case 4:
                                                do {
                                                    System.out.println("Nhập ID sinh viên : ");
                                                    id = scs.nextInt();
                                                    ql.display(id);
                                                    do {
                                                        System.out.println("Bạn muốn tìm tiếp không y/n");
                                                        flag = scc.nextLine();
                                                    } while (!flag.equals("y") && !flag.equals("n"));
                                                } while (flag.equals("y"));
                                                break;
                                            case 5:
                                                do {
                                                    System.out.println("Bạn muốn thoát không y/n");
                                                    flag = scc.nextLine();
                                                } while (!flag.equals("y"));
                                                break;
                                        }
                                    }
                                    while (num != 5);
                                    break;
                                case 2:
                                    System.out.println("Thông tin tài khoản của bạn : ");
                                    qluser.displayInfor(name, pass);
                                    do {
                                        System.out.println("1.Đổi mật khẩu : ");
                                        System.out.println("2.Quay lại : ");
                                        System.out.println("Nhập lựa chọn của bạn : ");
                                        num = scs.nextInt();
                                        switch (num) {
                                            case 1:
                                                User user1 = new User();
                                                if (qluser.find(name, pass) != -1) {
                                                    user1.setUsername(name);
                                                    String oldPass = pass;
                                                    System.out.println("Nhập mật khẩu mới : ");
                                                    pass = scc.nextLine();
                                                    user1.setUserpass(pass);
                                                    qluser.edit(name, oldPass, user1);
                                                    System.out.println("Bạn đã thay đổi mật khẩu thành công :");
                                                }
                                                break;
                                            case 2:
                                                do {
                                                    System.out.println("Bạn muốn quay lại không y/n");
                                                    flag = scc.nextLine();
                                                } while (!flag.equals("y"));
                                                break;
                                        }
                                    } while (num != 2);
                                    break;
                                case 3:
                                    do {
                                        System.out.println("Bạn muốn đăng xuất không y/n");
                                        flag = scc.nextLine();
                                    } while (!flag.equals("y"));
                                    break;
                            }
                        } while (num != 3);
                    } else {
                        System.out.println("Bạn nhập sai tên đăng nhập hoặc mật khẩu ");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Chào mừng bạn đến với trang đăng kí !");
                        System.out.println("Nhập username : ");
                        name = scc.nextLine();
                        System.out.println("Nhập userpass : ");
                        pass = scc.nextLine();
                        qluser.add(new User(name, pass));
                        do {
                            System.out.println("Bạn muốn đăng kí tiếp không y/n");
                            flag = scc.nextLine();
                        } while (!flag.equals("y") && !flag.equals("n"));
                    } while (flag.equals("y"));
                    break;
            }
        } while (num != 0);


    }

    private static void addSV(QuanLySinhVien ql, Scanner scs, Scanner scc) {
        int point;
        Student student;
        int id;
        int age;
        String name;
        System.out.println("Nhập vào thông tin ");
        System.out.println("Nhập id : ");
        id = scs.nextInt();
        System.out.println("Nhập tên : ");
        name = scc.nextLine();
        System.out.println("Nhập tuổi : ");
        age = scs.nextInt();
        System.out.println("Nhập điểm : ");
        point = scs.nextInt();
        student = new Student(id, name, age, point);
        ql.add(student);
    }
}
