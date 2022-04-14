public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Student student= new Student(1,"a",20,10);
        Student student1 =new Student(2,"b",18,8);
        Student student2 = new Student(3,"c",19,9);
        ql.add(student);
        ql.add(student1);
        ql.add(student2);
        ql.display();
        System.out.println(ql.find(1));
        ql.edit(1,student2);
        ql.display();
    }
}
