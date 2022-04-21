package mini_qlsv;

public interface QuanLy <T>{
    void add(T t);
    void edit(int id,T t);
    int find(int id);
    void displayAll();
}
