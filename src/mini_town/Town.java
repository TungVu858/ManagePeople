package mini_town;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Town implements Comparator<Family> {
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
        for (int i = 0; i < townList.size(); i++) {
            townList.get(i).dissplayAll();
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
        for (int i = 0; i < townList.size(); i++) {
            if (max < townList.get(i).getMember()) {
                max = townList.get(i).getMember();
            }
        }
        System.out.println("Hộ gia đình có thành viên nhiều nhất là : " + max);
    }

    public void edit(String adress, Family family) {
        townList.set(find(adress), family);
    }

    @Override
    public int compare(Family o1, Family o2) {
        if (o1.getMember() > o2.getMember()){
            return 1;
        }
        else if (o1.getMember() < o2.getMember()){
            return -1;
        }
        return 0;
    }
}
