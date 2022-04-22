package ql_tinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        ManagePeople people = new ManagePeople();
        ManageTinh manageTinh = new ManageTinh();
        String name;
        int id;
        int age;
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Thêm người ");
            System.out.println("2.Hiện thông tin người ");
            System.out.println("3.Hiện tỉnh và số người trong tỉnh ");
            System.out.println("0.Thoát ");
            System.out.print("Nhập lựa chọn : ");
            choice = checkException(scs);
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên : ");
                    name = scc.nextLine();
                    id = checkExceptionNumber("Nhập id : ");
                    age = checkExceptionNumber("Nhập tuổi :  ");
                    manageTinh.displayTinh();
                    int id1 = checkExceptionNumber("Nhập tỉnh(id) : ");
                    people.add(new People(id, name, age, ManageTinh.tinhList.get(manageTinh.findByIdTinh(id1))));
                    manageTinh.upDanSo(id1);
                    break;
                case 2:
                    people.displayPeople();
                    break;
                case 3:
                    id = checkExceptionNumber("Nhập id tỉnh : ");
                    people.printAllPersonByProvinceId(id);
                    break;
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
        boolean check = false;
        int choice = 0;
        Scanner scs = new Scanner(System.in);
        while (!check) {
            try {
                System.out.println(message);
                choice = scs.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Chỉ được nhập số !!!!!" + ANSI_RESET);
                scs.nextLine();
            }
        }
        return choice;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
