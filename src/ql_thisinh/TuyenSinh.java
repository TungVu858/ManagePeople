package ql_thisinh;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    List<ThiSinh> thiSinhList = new ArrayList<>();
    public void add(ThiSinh thiSinh){
        thiSinhList.add(thiSinh);
    }
    public void display(){
        boolean check = false;
        for (int i = 0; i < thiSinhList.size(); i++) {
            System.out.println(thiSinhList.get(i));
            check = true;
        }
        if (!check) System.out.println("Chưa có thí sinh nào ");
    }
    public void findById(int id){
        boolean check = false;
        for (int i =0;i<thiSinhList.size();i++){
            if (id == thiSinhList.get(i).getsBD()){
                System.out.println(thiSinhList.get(i));
                check = true;
            }
        }
        if (!check) System.out.println("Không tìm thấy SBD của thí sinh ");
    }
    public void exit(){
        System.exit(0);
    }
}
