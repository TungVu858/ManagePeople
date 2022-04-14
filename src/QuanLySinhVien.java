import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class QuanLySinhVien implements QuanLy<Student> {
    ArrayList<Student> list = new ArrayList();

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
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
    }

}
