package ql_thuvien;

public class Main {
    public static void main(String[] args) {
        ManageDocument manageDocument = new ManageDocument();
        manageDocument.add(new Book("Nhi Đồng",100,"Tùng",500));
        manageDocument.add(new Journal("Nhi Đồng",100,5,8));
        manageDocument.add(new Newspaper("Nhi Đồng",100,30));
        manageDocument.display();
        manageDocument.delete(2);
        System.out.println("Sau khi xóa ");
        manageDocument.display();
        System.out.println("Thêm mới ");
        manageDocument.add(new Journal("Nhi Đồng",100,5,8));
        manageDocument.add(new Book("Nhi Đồng",200,"Tùng",1000));
        manageDocument.add(new Book("Nhi Đồng",200,"Tùng",600));
        manageDocument.display();
        manageDocument.findByBook();
        manageDocument.findByJouranl();
    }
}
