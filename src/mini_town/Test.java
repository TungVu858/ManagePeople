package mini_town;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Family familyList = new Family();
        Town town = new Town();
        familyList.dissplayAll();
        familyList.add(new Person("tùng",21,"1","IT"));
        familyList.add(new Person("b",22,"2","Famer"));
        familyList.add(new Person("b1",23,"3","Famer"));
        familyList.add(new Person("b2",24,"4","Famer"));
        familyList.setAdress("Hà nội");
        familyList.dissplayAll();
        familyList.delete("1");
        familyList.edit("2",(new Person("b",25,"5","Famer")));
        familyList.dissplayAll();
        familyList.delete("3");
        familyList.dissplayAll();
        town.add(familyList);
        town.displayAll();
        town.delete(familyList);
        town.displayAll();
        town.add(familyList);
        Family familyList1 = new Family();
        familyList1.add(new Person("tùng",26,"6","IT"));
        familyList1.add(new Person("b",27,"5","Famer"));
        familyList1.add(new Person("b1",28,"8","Famer"));
        familyList1.add(new Person("b",29,"9","Famer"));
        Family family2 = new Family();
        family2.add(new Person("tùng",26,"6","IT"));
        family2.add(new Person("tùng",26,"6","IT"));
        family2.add(new Person("tùng",26,"6","IT"));
        family2.add(new Person("tùng",26,"6","IT"));
        family2.add(new Person("tùng",26,"6","IT"));
        family2.add(new Person("tùng",26,"6","IT"));
        familyList1.setAdress("Trung Văn - Hà Nội");
        town.add(familyList1);
        town.add(family2);
        System.out.println("trước khi sửa ");
        town.displayAll();
        town.edit("Hà nội",familyList1);
        System.out.println("Sau khi sửa ");
        town.add(familyList);
        town.displayAll();
        familyList1.findNamePerson("tùng");
        familyList.findAgeMin();
        town.findMemberMax();
        town.sortByMember();
        town.displayAll();
    }
}
