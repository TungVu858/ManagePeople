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
    public String display(String username){
        String str = " ";
        for (User user : arrayList) {
            if (username.equals(user.getUsername())) str += user;
        }
        return str;
    }
}
