package week7.task1;

public class Faculty extends Employee{
    private int hours;
    private String rank;
public Faculty(){}
    public Faculty(String name) {
        super(name);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Class Name: Faculty\nName: " + getName();
    }
}
