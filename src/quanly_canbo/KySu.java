package quanly_canbo;

public class KySu extends CanBo{
    private String job;

    public KySu() {
    }

    public KySu(String name, int age, String gender, String adress, String job) {
        super(name, age, gender, adress);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString()+ "KySu{"  +
                "job='" + job + '\'' +
                '}';
    }
}
