package week7.task1;

public class Student1 {
    String id;
    String name;
    int age;
    String department;
    String grade;

    public Student1(String id, String name, int age, String department, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + department + "," + grade;
    }
}
