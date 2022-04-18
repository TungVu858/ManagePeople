package mini_town;

import java.util.ArrayList;
import java.util.List;

public class Family extends Person {
    List<Person> personList = new ArrayList<>();
    private String adress;
    private int member = 0;

    public Family() {
    }

    public Family(String name, int age, String id, String job, String adress, int member) {
        super(name, age, id, job);
        this.adress = adress;
        this.member = member;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public void add(Person person) {
        personList.add(person);
        member++;
    }

    public int find(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (id.equals(personList.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String id, Person person) {
        personList.set(find(id), person);
    }

    public void delete(String id) {
        System.out.println("Bạn đã xóa "+personList.get(find(id)).getName());
        personList.remove(find(id));
        member--;

    }
    public void dissplayAll(){
        boolean check = false;
        System.out.println("Thành viên của hộ gia đình : ");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
            check = true;
        }
        if (check){
            System.out.println("Địa chỉ : " + getAdress());
            System.out.println("Số thành viên : " + member);
            System.out.println("----------------------------");
        }
        else {
            System.out.println("Chưa có hộ gia đình !");
            System.out.println("-----------------------------");
        }
    }
}
