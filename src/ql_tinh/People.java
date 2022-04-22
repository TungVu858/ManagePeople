package ql_tinh;

public class People {
    private int idPeople;
    private String name;
    private int age;
    private Tinh tinh;

    public People() {
    }

    public People(int idPeople, String name, int age, Tinh tinh) {
        this.idPeople = idPeople;
        this.name = name;
        this.age = age;
        this.tinh = tinh;
    }

    public Tinh getTinh() {
        return tinh;
    }

    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
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

    @Override
    public String toString() {
        return "People{" +
                "idPeople=" + idPeople +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id= " + tinh +
                '}';
    }
}
