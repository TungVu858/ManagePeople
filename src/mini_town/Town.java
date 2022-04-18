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
        for (int i = 0; i < townList.size(); i++) {
            System.out.println(townList.get(i));
        }
    }
}
