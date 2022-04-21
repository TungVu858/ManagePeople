package mini_town_bt;

import mini_qlsv.QuanLyUser;
import mini_qlsv.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        Person person = new Person();
        Town town = new Town();
        Family familyList = new Family("Hà Nội");
        int choice = -1;
        String name;
        String pass;
        String id;
        String adress;
        int age;
        String job;
        QuanLyUser qluser = new QuanLyUser();

        while (choice != 0) {
            System.out.println("*******************Menu*******************");
            System.out.println("------------------------------------------");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng kí");
            System.out.println("0.Thoát");
            System.out.println("------------------------------------------");
            System.out.print("Nhập lựa chọn : ");
            try {
                choice = scs.nextInt();
            } catch (Exception e) {
                System.out.println("Chỉ được nhập số!");
                scs.nextLine();
                choice = -1;
            }
            switch (choice) {
                case 1:
                    System.out.println("Chào mừng bạn đến với màn hình đăng nhập ");
                    System.out.println("Nhập username : ");
                    name = scc.nextLine();
                    System.out.println("Nhập userpass : ");
                    pass = scc.nextLine();
                    if (qluser.find(name, pass) != -1) {
                        System.out.println("Bạn đăng nhập thành công ");
                        System.out.println("-------------------------- ");
                        System.out.println(qluser.display(name, pass));
                        int choice_2 = -1;
                        while (choice_2 != 0) {
                            System.out.println("1.Quản lý hộ gia đình : ");
                            System.out.println("2.Quản lý khu phố : ");
                            System.out.println("3.Xem thông tin tài khoản");
                            System.out.println("0.Đăng xuất : ");
                            System.out.print("Nhập lựa chọn của bạn : ");
                            try {
                                choice_2 = scs.nextInt();
                            } catch (Exception e) {
                                System.out.println("Chỉ được nhập số!");
                                scs.nextLine();
                                choice_2 = -1;
                            }
                            switch (choice_2) {
                                case 1:
                                    int choice_3 = -1;
                                    while (choice_3 != 0) {
                                        System.out.println("Trang quảng lý hộ gia đình");
                                        System.out.println("1.Thêm thành viên ");
                                        System.out.println("2.Xóa thành viên ");
                                        System.out.println("3.Sửa thành viên ");
                                        System.out.println("4.Tìm tên thành viên ");
                                        System.out.println("5.Tìm thành viên bé tuổi nhất ");
                                        System.out.println("6.Hiển thị toàn bộ thành viên ");
                                        System.out.println("0.Thoát ");
                                        try {
                                            choice_3 = scs.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Chỉ được nhập số!");
                                            scs.nextLine();
                                            choice_3 = -1;
                                        }
                                        switch (choice_3) {
                                            case 1:
                                                addMember(familyList, scs, scc);
//                                                System.out.println("Nhập vào địa chỉ ");
//                                                adress = scc.nextLine();
//                                                familyList.setAdress(adress);
                                                break;
                                            case 2:
                                                System.out.println("Nhập vào id thành viên cần xóa ");
                                                id = scc.nextLine();
                                                familyList.delete(id);
                                                break;
                                            case 3:
                                                System.out.println("Nhập vào id thành viên cần sửa ");
                                                id = scc.nextLine();
                                                if (familyList.find(id) != -1) {
                                                    editMember(person, scc, scs);
                                                    familyList.edit(id, person);
                                                }
                                                else System.out.println("Không tìm thấy ");
                                                break;
                                            case 4:
                                                System.out.println("Nhập tên thành viên cần tìm : ");
                                                name = scc.nextLine();
                                                familyList.findNamePerson(name);
                                                break;
                                            case 5:
                                                familyList.findAgeMin();
                                                break;
                                            case 6:
                                                familyList.dissplayAll();
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    int choice_4 = -1;
                                    while (choice_4 != 0) {
                                        System.out.println("Trang quảng lý khu phố");
                                        System.out.println("1.Thêm hộ gia đình ");
                                        System.out.println("2.Xóa hộ gia đình ");
                                        System.out.println("3.Sửa hộ gia đình ");
                                        System.out.println("4.Hiển thị các hộ gia đình ");
                                        System.out.println("5.Hiển thị hộ gia đình có nhiều thành viên nhất ");
                                        System.out.println("6.Sắp xếp hộ gia đình tăng dần thành viên ");
                                        System.out.println("0.Thoát ");
                                        try {
                                            choice_4 = scs.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Chỉ được nhập số!");
                                            scs.nextLine();
                                            choice_4 = -1;
                                        }
                                        switch (choice_4) {
                                            case 1: {
//                                                Family familyList1 = new Family();
//                                                familyList1.add(new Person("tùng", 26, "6", "IT"));
//                                                familyList1.add(new Person("b", 27, "5", "Famer"));
//                                                familyList1.add(new Person("b1", 28, "8", "Famer"));
//                                                familyList1.add(new Person("b", 29, "9", "Famer"));
//                                                familyList1.setAdress("Đại Linh - Trung Văn");
//                                                Family family2 = new Family();
//                                                family2.add(new Person("tùng", 26, "6", "IT"));
//                                                family2.add(new Person("tùng", 26, "12", "IT"));
//                                                family2.add(new Person("tùng", 26, "13", "IT"));
//                                                family2.add(new Person("tùng", 26, "18", "IT"));
//                                                family2.add(new Person("tùng", 26, "23", "IT"));
//                                                family2.add(new Person("tùng", 26, "45", "IT"));
//                                                family2.setAdress("Trung Văn - Hà Nội");
                                                town.add(familyList);
//                                                town.add(familyList1);
//                                                town.add(family2);
                                                break;
                                            }
                                            case 2:
                                                town.delete(familyList);
                                                break;
                                            case 3:
                                                System.out.println("Nhập địa chỉ hộ gia đình cần xóa ");
                                                adress = scc.nextLine();
                                                System.out.println("Nhập hộ gia đình chuyển đến ");
                                                town.edit(adress, familyList);
                                                break;
                                            case 4:
                                                town.displayAll();
                                                break;
                                            case 5:
                                                town.findMemberMax();
                                                break;
                                            case 6:
                                                town.sortByMember();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Thông tin tài khoản của bạn : ");
                                    qluser.displayInfor(name, pass);
                                    while (choice != 2) {
                                        System.out.println("1.Đổi mật khẩu ");
                                        System.out.println("2.Thoát");
                                        try {
                                            choice = scs.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Chỉ được nhập số!");
                                            scs.nextLine();
                                            choice = -1;
                                        }
                                        if (choice == 1) {
                                            User user1 = new User();
                                            user1.setUsername(name);
                                            String oldPass = pass;
                                            System.out.println("Nhập mật khẩu mới : ");
                                            pass = scc.nextLine();
                                            user1.setUserpass(pass);
                                            qluser.edit(name, oldPass, user1);
                                            System.out.println("Bạn đã thay đổi mật khẩu thành công :");
                                        }
                                    }
                            }
                        }

                    }
                    break;
                case 2:
                    int choice_1 = -1;
                    while (choice_1 != 0) {
                        System.out.println("Chào mừng bạn đến với màn hình đăng kí ");
                        System.out.println("1.Tạo tài khoản!");
                        System.out.println("0.Thoát");
                        System.out.println("Nhập lựa chọn : ");
                        try {
                            choice_1 = scs.nextInt();
                        } catch (Exception e) {
                            System.out.println("Chỉ được nhập số!");
                            scs.nextLine();
                            choice_1 = -1;
                        }
                        if (choice_1 == 1) {
                            System.out.println("Nhập username ");
                            name = scc.nextLine();
                            System.out.println("Nhập userpass");
                            pass = scc.nextLine();
                            System.out.println("Nhập lại userpass");
                            String repass = scc.nextLine();
                            if (pass.equals(repass)) {
                                qluser.add(new User(name, pass));
                            } else {
                                System.out.println("Bạn cần nhập 2 mật khẩu trùng nhau !");
                            }
                        }
                    }
            }
        }
//        Family familyList = new Family();
//        Town town = new Town();
//        familyList.dissplayAll();
//        familyList.add(new Person("tùng", 21, "1", "IT"));
//        familyList.add(new Person("b", 22, "2", "Famer"));
//        familyList.add(new Person("b1", 23, "3", "Famer"));
//        familyList.add(new Person("b2", 24, "4", "Famer"));
//        familyList.setAdress("Hà nội");
//        familyList.dissplayAll();
//        familyList.delete("1");
//        familyList.edit("2", (new Person("b", 25, "5", "Famer")));
//        familyList.dissplayAll();
//        familyList.delete("3");
//        familyList.dissplayAll();
//        town.add(familyList);
//        town.displayAll();
//        town.delete(familyList);
//        town.displayAll();
//        town.add(familyList);

//        Family family2 = new Family();

//        familyList1.setAdress("Trung Văn - Hà Nội");
//        town.add(familyList1);
//        town.add(family2);
//        System.out.println("trước khi sửa ");
//        town.displayAll();
//        town.edit("Hà nội", familyList1);
//        System.out.println("Sau khi sửa ");
//        town.add(familyList);
//        town.displayAll();
//        family2.findNamePerson("tùng");
//        familyList.findAgeMin();
//        town.findMemberMax();
//        town.sortByMember();
//        System.out.println("Sau sắp xếp : ");
//        town.displayAll();
    }

    private static void addMember(Family family, Scanner scs, Scanner scc) {
        String name;
        int age;
        String id;
        String job;
        Person person;
        System.out.println("Nhập vào thông tin thành viên ");
        System.out.println("Nhập tên : ");
        name = scc.nextLine();
        System.out.println("Nhập id : ");
        id = scc.nextLine();
        System.out.println("Nhập tuổi : ");
        age = scs.nextInt();
        System.out.println("Nhập nghề nghiệp : ");
        job = scc.nextLine();
        person = new Person(name, age, id, job);
        family.add(person);
    }

    private static void editMember(Person person, Scanner scc, Scanner scs) {
        String id1;
        String name;
        int age;
        String job;
        System.out.println("Nhập id mới : ");
        id1 = scc.nextLine();
        person.setId(id1);
        System.out.println("Nhập tên mới : ");
        name = scc.nextLine();
        person.setName(name);
        System.out.println("Nhập tuổi mới : ");
        age = scs.nextInt();
        person.setAge(age);
        System.out.println("Nhập nghề nghiệp mới : ");
        job = scc.nextLine();
        person.setJob(job);
    }
}
