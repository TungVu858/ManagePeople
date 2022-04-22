package ql_tinh;

import java.util.ArrayList;
import java.util.List;

public class ManageTinh {
    public static List<Tinh> tinhList = new ArrayList<>();
    private int num = 0;

    static {
        tinhList.add(new Tinh("Hà Nội", 1, 0, 20000));
        tinhList.add(new Tinh("Nam Định", 2, 0, 15000));
        tinhList.add(new Tinh("Thái Bình", 3, 0, 15000));
        tinhList.add(new Tinh("Hải Phòng", 4, 0, 15000));
        tinhList.add(new Tinh("Hải Dương", 5, 0, 15000));
    }

    public void add(Tinh tinh) {
        tinhList.add(tinh);
    }

    public int findByIdTinh(int id) {
        for (int i = 0; i < tinhList.size(); i++) {
            if (id == tinhList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void displayTinh() {
        for (Tinh i : tinhList
        ) {
            System.out.println(i);
        }
    }

    public void upDanSo(int id) {
        num = tinhList.get(findByIdTinh(id)).getDanSo() + 1;
        tinhList.get(findByIdTinh(id)).setDanSo(num);
    }

}
