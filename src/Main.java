import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        QuanLyUser qluser = new QuanLyUser();
        Scanner scs = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        int num;
        int id;
        String name;
        String pass;
        Student student;
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
                    System.out.println("Nhập username : ");
                    name = scc.nextLine();
                    System.out.println("Nhập userpass : ");
                    pass = scc.nextLine();
                    if (qluser.find(name, pass) != -1) {
                        System.out.println("Bạn đăng nhập thành công ");
                        System.out.println("-------------------------- ");
                        System.out.println(qluser.display(name));
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
                                            System.out.println("Nhập vào thông tin sửa : ");
                                            System.out.println("Nhập tên : ");
                                            name = scc.nextLine();
                                            System.out.println("Nhập tuổi : ");
                                            age = scs.nextInt();
                                            System.out.println("Nhập điểm : ");
                                            point = scs.nextInt();
                                            student = new Student(id1, name, age, point);
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
                            }
                        }
                        while (num != 5);
                    } else {
                        System.out.println("Bạn nhập sai tên đăng nhập hoặc mật khẩu ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập username : ");
                    name = scc.nextLine();
                    System.out.println("Nhập userpass : ");
                    pass = scc.nextLine();
                    qluser.add(new User(name, pass));
            }
        } while (num != 0);

//        Student student5 = new Student(1, "a", 20, 10);
//        Student student1 = new Student(2, "b", 18, 8);
//        Student student2 = new Student(3, "c", 19, 9);
//        Student student3 = new Student(4, "d", 19, 10);
//        ql.add(student5);
//        ql.add(student1);
//        ql.add(student2);
//        ql.add(student3);
//        ql.displayAll();
//        ql.edit(1, student2);
//        ql.displayAll();
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
