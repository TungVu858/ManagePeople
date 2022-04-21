package quanly_canbo;

public interface QuanLy<T> {
    void add(T t);
    int findByName(String name);
    void displayAll();
    void edit(String name,T t);
}
