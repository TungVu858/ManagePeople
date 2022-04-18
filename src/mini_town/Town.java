package mini_town;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family>  townList = new ArrayList<>();
    public void add(Family family){
        townList.add(family);
    }
    public void delete(Family family){
        townList.remove(family);
    }
    public void displayAll(){
        boolean check = false;
        System.out.println("Hộ gia đình : ");
        for (int i = 0; i < townList.size(); i++) {
            townList.get(i).dissplayAll();
            check = true;
        }
        if (!check){
            System.out.println("Chưa có hộ gia đình");
            System.out.println("-----------------------");
        }
    }
}
