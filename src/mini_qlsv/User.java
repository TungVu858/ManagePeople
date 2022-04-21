package mini_qlsv;

public class User {
    private String username;
    private String userpass;
    public User() {
    }

    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "mini_qlsv.User{" +
                "username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}
