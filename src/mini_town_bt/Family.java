package mini_town_bt;

import java.util.ArrayList;
import java.util.List;

public class Family implements Comparable<Family> {
    List<Person> personList = new ArrayList<>();
    private String adress;
    private int member = 0;

    public Family() {
    }

    public Family(String adress) {
        this.adress = adress;
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

    public void findNamePerson(String name) {
        boolean check = false;
        for (Person person : personList) {
            if (name.equals(person.getName())) {
                System.out.println(person);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy");
        }
    }

    public void findAgeMin() {
        if (personList.size() >0) {
            int min = personList.get(0).getAge();
            for (Person value : personList) {
                if (min > value.getAge()) {
                    min = value.getAge();
                }
            }
            for (Person person : personList
            ) {
                if (min == person.getAge()) {
                    System.out.println("Thành viên nhỏ tuổi nhất là : " + person);
                }
            }
        }else System.out.println("Chưa có thành viên nào ");
    }

    public void delete(String id) {
        if (find(id) != -1) {
            System.out.println("Bạn đã xóa " + personList.get(find(id)).getName());
            personList.remove(find(id));
            member--;
        } else System.out.println("Không tìm thấy ");

    }

    public void dissplayAll() {
        boolean check = false;
        System.out.println("Thành viên của hộ gia đình : ");
        System.out.println("Địa chỉ : " + adress);
        System.out.println("Số thành viên : " + member);
        for (Person person : personList) {
            System.out.println(person);
            check = true;
        }
        if (check) {
            System.out.println("----------------------------");
        } else {
            System.out.println("Chưa có hộ gia đình !");
            System.out.println("-----------------------------");
        }
    }

    @Override
    public int compareTo(Family o) {
        return this.getMember() - o.getMember();
    }
}
