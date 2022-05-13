package week6;

public class Student {
    private String name;
    private String rollNo;
    private Department departmentName;
    private int age;

    public Student() {
    }

    public Student(String name, Department departmentName, int age) {
        this.name = name;
        this.departmentName = departmentName;
        this.age = age;
    }

    public Student(String name, String rollNo, Department departmentName, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.departmentName = departmentName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Department getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
