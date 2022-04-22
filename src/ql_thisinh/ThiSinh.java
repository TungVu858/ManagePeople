package ql_thisinh;

public class ThiSinh {
    private int sBD;
    private String name;
    private String adress;
    private int uuTien;

    public ThiSinh() {
    }

    public ThiSinh(int sBD, String name, String adress, int uuTien) {
        this.sBD = sBD;
        this.name = name;
        this.adress = adress;
        this.uuTien = uuTien;
    }

    public int getsBD() {
        return sBD;
    }

    public void setsBD(int sBD) {
        this.sBD = sBD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getUuTien() {
        return uuTien;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "sBD=" + sBD +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", uuTien=" + uuTien +
                '}';
    }
}
