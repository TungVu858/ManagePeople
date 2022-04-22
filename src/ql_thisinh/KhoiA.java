package ql_thisinh;

public class KhoiA extends ThiSinh {
    private static final String TOAN = "Toán";
    private static final String LY = "Lý";
    private static final String HOA = "Hóa";

    public KhoiA() {
    }

    public KhoiA(int sBD, String name, String adress, int uuTien) {
        super(sBD, name, adress, uuTien);
    }

    @Override
    public String toString() {
        return super.toString() + " Khoi A{ " + TOAN + " , " + LY + " , " + HOA + " }";
    }
}
