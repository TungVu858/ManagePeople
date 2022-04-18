package mini_town;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Family familyList = new Family();
        Town town = new Town();
        familyList.dissplayAll();
        familyList.add(new Person("tùng",21,"1","IT"));
        familyList.add(new Person("b",21,"2","Famer"));
        familyList.add(new Person("b1",21,"3","Famer"));
        familyList.add(new Person("b",21,"4","Famer"));
        familyList.setAdress("Hà nội");
        familyList.dissplayAll();
        familyList.delete("1");
        familyList.edit("2",(new Person("b",21,"5","Famer")));
        familyList.dissplayAll();
        familyList.delete("3");
        familyList.dissplayAll();
        town.add(familyList);
        town.displayAll();
        town.delete(familyList);
        town.displayAll();
    }
}
