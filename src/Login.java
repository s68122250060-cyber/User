public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ===== Getter =====
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean loginStatus() {
        // check login
        System.out.println("Login by user: " + username);
        return true;
    }
}
