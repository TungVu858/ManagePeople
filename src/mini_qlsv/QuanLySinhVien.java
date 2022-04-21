package mini_qlsv;

import java.util.ArrayList;

public class QuanLySinhVien implements QuanLy<Student> {
    ArrayList<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        list.set(find(id), student);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayAll() {
        boolean check = false;
        for (Student student : list) {
            System.out.println(student);
            check = true;
        }
        if (!check){
            System.out.println("Chưa có sinh viên nào ");
        }
        System.out.println("-----------------------");
    }

    public void display(int id) {
        boolean check = false;
        String str = " ";
        for (Student student : list) {
            if (id == student.getId()) {
                str += student;
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy ID sinh viên ");
        } else {
            System.out.println("Thông tin sinh viên tìm được : ");
            System.out.println(str);
        }
    }

}
