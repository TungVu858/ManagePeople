package ql_thuvien;

public interface Manage<T> {
    void add(T t);
    int findById(int id);
    void delete(int id);
    void display();
}
