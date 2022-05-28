package week8.task2;

public class ClassB extends Marks {
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;
    int subject4Marks;

    public ClassB(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    double getPercentage() {
        double sum = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        return (sum / 400) * 100;
    }
}
