package ql_tinh;

public class Tinh {
    private int id;
    private int danSo;
    private int gDP;
    private String nameTinh;

    public Tinh() {
    }

    public Tinh(String nameTinh, int id, int danSo, int gDP) {
        this.nameTinh = nameTinh;
        this.id = id;
        this.danSo = danSo;
        this.gDP = gDP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getgDP() {
        return gDP;
    }

    public void setgDP(int gDP) {
        this.gDP = gDP;
    }

    public String getNameTinh() {
        return nameTinh;
    }

    public void setNameTinh(String nameTinh) {
        this.nameTinh = nameTinh;
    }

    @Override
    public String toString() {
        return id + " , " + nameTinh + " , " + danSo + " , " + gDP;
    }
}
