package week6;

public class User {
    private String userName;
    private String cnic;
    private int age;


    public User(String userName, String cnic, int age) {
        this.userName = userName;
        this.cnic = cnic;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
