package mini_town_bt;

public class Person {
    private String name;
    private int age;
    private String id;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String id, String job) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "mini_qlsv.People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", job='" + job + '\'' +
                '}';
    }
}
