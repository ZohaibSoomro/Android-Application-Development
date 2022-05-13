package week6;

public class Department {
    private int departmentId;
    private String departmentName;
    private String managerName;

    public Department() {
    }

    public Department(int departmentId, String departmentName, String managerName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerName = managerName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
