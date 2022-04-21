package mini_town_bt;

import java.util.*;

public class Town {
    List<Family> townList = new ArrayList<>();

    public void add(Family family) {
        townList.add(family);
    }

    public void delete(Family family) {
        townList.remove(family);
    }

    public void displayAll() {
        boolean check = false;
        System.out.println("Hộ gia đình : ");
        for (Family family : townList) {
            family.dissplayAll();
            check = true;
        }
        if (!check) {
            System.out.println("Chưa có hộ gia đình");
            System.out.println("-----------------------");
        }
    }

    public int find(String adress) {
        for (int i = 0; i < townList.size(); i++) {
            if (adress.equals(townList.get(i).getAdress()))
                return i;
        }
        return -1;
    }

    public void findMemberMax() {
        int max = 0;
        for (Family family : townList) {
            if (max < family.getMember()) {
                max = family.getMember();
            }
        }
        System.out.println("Hộ gia đình có thành viên nhiều nhất là : " + max);
    }

    public void edit(String adress, Family family) {
        if (find(adress)!=-1)
        townList.set(find(adress), family);
        else System.out.println("Không tìm thấy ");
    }

    public void sortByMember() {
        Collections.sort(townList);
    }
}
