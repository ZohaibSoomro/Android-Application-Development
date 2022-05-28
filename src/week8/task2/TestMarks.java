package week8.task2;

public class TestMarks {
    public static void main(String[] args) {
        ClassA a = new ClassA(34, 57, 89);
        ClassB b = new ClassB(67, 45, 95, 82);
        System.out.println("Student A percentage: " + a.getPercentage() + "%");
        System.out.println("Student B percentage: " + b.getPercentage() + "%");
    }
}
