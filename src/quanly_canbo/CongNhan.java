package quanly_canbo;

public class CongNhan extends CanBo{
    private int level;

    public CongNhan() {
    }

    public CongNhan(String name, int age, String gender, String adress, int level) {
        super(name, age, gender, adress);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+"CongNhan{" +
                "level=" + level +
                '}';
    }
}
