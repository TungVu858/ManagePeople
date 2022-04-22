package ql_thisinh;

public class KhoiC extends ThiSinh{
    private static final String VAN = "Văn";
    private static final String SU = "Sử";
    private static final String DIA = "Địa";

    public KhoiC() {
    }

    public KhoiC(int sBD, String name, String adress, int uuTien) {
        super(sBD, name, adress, uuTien);
    }

    @Override
    public String toString() {
        return super.toString()+" Khoi C { " + VAN + " , " + SU + " , " + DIA + " }";
    }
}
