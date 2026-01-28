public class User {

    private int userId;
    private int departmentId;
    private String userUsername;
    private String userPassword;
    private String userName;
    private String userSurname;
    private Gender userGender;
    private String userEmail;
    private RoleUser userRole;

    public User(int userId, int departmentId, String userUsername, String userPassword,
                String userName, String userSurname, Gender userGender,
                String userEmail, RoleUser userRole) {

        this.userId = userId;
        this.departmentId = departmentId;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userGender = userGender;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }

    // ===== Getter =====
    public int getUserId() {
        return userId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public RoleUser getUserRole() {
        return userRole;
    }

    // ===== Methods ตาม Diagram =====
    public void userLogin() {
        System.out.println("User login: " + userUsername);
    }

    public void addProposal() {
        System.out.println("Add proposal by: " + userName + " " + userSurname);
    }

    public void viewProposal() {
        System.out.println("View proposal by: " + userUsername);
    }

    public void confirmProposal() {
        System.out.println("Confirm proposal by role: " + userRole);
    }

    public void createReports() {
        System.out.println("Create report by department ID: " + departmentId);
    }

    public void viewReports() {
        System.out.println("View reports by: " + userUsername);
    }

    public void updateDepartment() {
        System.out.println("Update department by user ID: " + userId);
    }
}
