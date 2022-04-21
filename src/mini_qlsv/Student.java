package mini_qlsv;

public class Student extends People {
    private double point;

    public Student() {
    }

    public Student(int id, String name, int age, double point) {
        super(id, name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "mini_qlsv.Student{" +
                "Id = " + getId() +
                " Name = " + getName() +
                " Age = " + getAge() +
                " point=" + point +
                '}';
    }
}
