package week7.task1;

public class Student extends Person {
    private final String classStatus;

    public Student(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String classStatus) {
        super(name);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return "Class Name: Student\nName: " + getName();
    }
}
