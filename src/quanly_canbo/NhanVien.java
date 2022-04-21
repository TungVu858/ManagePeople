package quanly_canbo;

public class NhanVien extends CanBo{
    private String work;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String adress, String work) {
        super(name, age, gender, adress);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVien{" +
                "work='" + work + '\'' +
                '}';
    }
}
