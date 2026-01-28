public class Department {

    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    // ===== Getter =====
    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // ===== Methods ตาม Diagram =====
    public void insertDepartment() {
        System.out.println("Insert Department: " + departmentName);
    }

    public void updateDepartment() {
        System.out.println("Update Department ID: " + departmentId);
    }

    public void deleteDepartment() {
        System.out.println("Delete Department ID: " + departmentId);
    }
}
