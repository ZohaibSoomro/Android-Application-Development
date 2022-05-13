package week6;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private String jobId;
    private Address address;
    private char gender;
    private int contactNumber;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Department departmentId, String jobId, Address address, char gender, int contactNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = departmentId;
        this.jobId = jobId;
        this.address = address;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
