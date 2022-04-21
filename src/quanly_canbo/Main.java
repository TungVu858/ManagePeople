package quanly_canbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        int choice = -1;
        String name;
        int age;
        String gender;
        String adress;
        int level;
        String job;
        String work;
        while (choice != 0) {
            System.out.println("1.Thêm ");
            System.out.println("2.Tìm ");
            System.out.println("3.Sửa ");
            System.out.println("4.Hiển thị");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chọn : ");
            try {
                choice = scs.nextInt();
            } catch (Exception e) {
                System.err.println("Chỉ được nhập số ");
                scs.nextLine();
                choice = -1;
            }
            switch (choice) {
                case 1:
                    int choice_1 = -1;
                    while (choice_1 != 0) {
                        System.out.println("1.Thêm công nhân : ");
                        System.out.println("2.Thêm kỹ sư : ");
                        System.out.println("3.Thêm nhân viên : ");
                        System.out.println("0.Thoát");
                        System.out.println("Nhập lựa chọn : ");
                        try {
                            choice_1 = scs.nextInt();
                        } catch (Exception e) {
                            System.err.println("Chỉ được nhập số ");
                            scs.nextLine();
                            choice_1 = -1;
                        }
                        switch (choice_1) {
                            case 1:
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập tuổi : ");
                                age = scs.nextInt();
                                System.out.println("Nhập giới tính : ");
                                gender = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                System.out.println("Nhập vào cấp độ : ");
                                level = scs.nextInt();
                                quanLyCanBo.add(new CongNhan(name, age, gender, adress, level));
                                System.out.println("Bạn đã thêm thành công : " + name);
                                break;
                            case 2:
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập tuổi : ");
                                age = scs.nextInt();
                                System.out.println("Nhập giới tính : ");
                                gender = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                System.out.println("Nhập ngành học : ");
                                job = scc.nextLine();
                                quanLyCanBo.add(new KySu(name, age, gender, adress,job));
                                System.out.println("Bạn đã thêm thành công " + name);
                                break;
                            case 3:
                                System.out.println("Nhập tên : ");
                                name = scc.nextLine();
                                System.out.println("Nhập tuổi : ");
                                age = scs.nextInt();
                                System.out.println("Nhập giới tính : ");
                                gender = scc.nextLine();
                                System.out.println("Nhập địa chỉ : ");
                                adress = scc.nextLine();
                                System.out.println("Nhập công việc : ");
                                work = scc.nextLine();
                                quanLyCanBo.add(new NhanVien(name, age, gender, adress,work));
                                System.out.println("Bạn đã thêm thành công " + name);
                        }
                    }

                    break;
                case 2:
                    System.out.println("Nhập tên cần tìm : ");
                    name = scc.nextLine();
                    quanLyCanBo.displayByName(name);
                    break;
                case 3:
                    String name1;
                    System.out.println("Nhập tên cần sửa : ");
                    name1 = scc.nextLine();
                    if (quanLyCanBo.findByName(name1) != -1) {
                        System.out.println("Nhập tên mới : ");
                        name = scc.nextLine();
                        System.out.println("Nhập tuổi mới : ");
                        age = scs.nextInt();
                        System.out.println("Nhập giới tính mới : ");
                        gender = scc.nextLine();
                        System.out.println("Nhập địa chỉ mới : ");
                        adress = scc.nextLine();
                        quanLyCanBo.edit(name1, new CanBo(name, age, gender, adress));
                    } else System.out.println("Không tìm thấy ");

                    break;
                case 4:
                    System.out.println("Hiển thị toàn bộ : ");
                    quanLyCanBo.displayAll();
                    break;
            }
        }


        quanLyCanBo.add(new CanBo("tùng", 29, "nam", "HN"));
        quanLyCanBo.add(new CanBo("đạt", 25, "nam", "HN"));
        quanLyCanBo.add(new KySu("Tùng", 29, "nam", "Hn", "IT"));
        quanLyCanBo.add(new CongNhan("abc",25,"nam","HN",10));
        quanLyCanBo.add(new NhanVien());
        quanLyCanBo.findByName("tùng");
        quanLyCanBo.displayAll();
        quanLyCanBo.displayByName("tùng");
        System.out.println("Sau thay đổi ");
        quanLyCanBo.edit("đạt", new CanBo("hoàng", 23, "nam", "HN"));
        quanLyCanBo.displayAll();
    }
}
