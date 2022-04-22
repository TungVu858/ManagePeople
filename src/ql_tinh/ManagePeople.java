package ql_tinh;

import java.util.ArrayList;
import java.util.List;

public class ManagePeople {
    List<People> peopleList = new ArrayList<>();
    public void add(People people){
        peopleList.add(people);
    }
    public void displayPeople(){
        boolean check = false;
        for (People i :peopleList
             ) {
            System.out.println(i);
            check = true;
        }
        if (!check) System.out.println("Chưa có người nào !!!");
    }
    public void findByName(String name){
        for (int i =0;i<peopleList.size();i++){
            if (name.equals(peopleList.get(i).getName())){
                System.out.println(peopleList.get(i));
            }
        }
    }
    public void printAllPersonByProvinceId(int id) {
        boolean check = false;
        for (People p : peopleList) {
            if (p.getTinh().getId() == id) {
                System.out.println(p);
                check = true;
            }
        }
        if (!check) System.out.println("Chưa có người trong tỉnh !!");
    }
}
