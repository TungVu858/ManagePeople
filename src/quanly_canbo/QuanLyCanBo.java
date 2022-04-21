package quanly_canbo;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements QuanLy<CanBo>{
    List<CanBo> listCanBo = new ArrayList<>();
    @Override
    public void add(CanBo canBo) {
        listCanBo.add(canBo);
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listCanBo.size(); i++) {
            if (name.equals(listCanBo.get(i).getName())){
                System.out.println(listCanBo.get(i));
                return i ;
            }
        }
        return -1;
    }

    @Override
    public void displayAll() {
        boolean check = false;
        for (int i = 0; i < listCanBo.size(); i++) {
            System.out.println(listCanBo.get(i));
            check = true;
        }
        if (!check){
            System.out.println("Chưa có thành viên nào ");
        }
    }

    @Override
    public void edit(String name,CanBo canBo) {
            listCanBo.set(findByName(name),canBo);
    }

    public void displayByName(String name){
        if (findByName(name)!=-1){
            for (int i = 0; i < listCanBo.size(); i++) {
                if (name.equals(listCanBo.get(i).getName()))
                System.out.println(listCanBo.get(i));
            }
        }
        else System.out.println("Không tìm thấy ");
    }
}
