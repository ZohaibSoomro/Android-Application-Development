package week8.task2;

public class ClassA extends Marks{
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;

    public ClassA(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    double getPercentage() {
        double sum = subject1Marks + subject2Marks + subject3Marks;
        return (sum / 300) * 100;
    }
}
