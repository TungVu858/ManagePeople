package ql_thisinh;

public class KhoiB extends ThiSinh {
    private static final String TOAN = "Toán";
    private static final String HOA = "Hóa";
    private static final String SINH = "Sinh";

    public KhoiB() {
    }

    public KhoiB(int sBD, String name, String adress, int uuTien) {
        super(sBD, name, adress, uuTien);
    }

    @Override
    public String toString() {
        return super.toString() + " Khoi B{ " + TOAN + " , " + HOA + " , " + SINH + " }";
    }
}
