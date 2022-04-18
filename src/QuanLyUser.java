import java.util.ArrayList;

public class QuanLyUser{
    ArrayList<User> arrayList = new ArrayList<>();
    public void add(User user) {
        arrayList.add(user);
        System.out.println("Bạn đã đăng kí thành công ");
    }

    public int find(String username,String userpass) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (username.equals(arrayList.get(i).getUsername()) && userpass.equals(arrayList.get(i).getUserpass())) {
                return i;
            }
        }
        return -1;
    }
    public String display(String username,String userpass){
        String str = "username : ";
        for (User user : arrayList) {
            if (username.equals(user.getUsername())&&userpass.equals(user.getUserpass())) str += user.getUsername();
        }
        return str;
    }
    public void displayInfor(String username,String userpass){
        for (User user : arrayList) {
            if (username.equals(user.getUsername())&&userpass.equals(user.getUserpass())) System.out.println(user);;
        }
    }
    public void edit(String name,String pass, User user) {
        int index = find(name, pass);
        arrayList.set(index, user);
    }
}
