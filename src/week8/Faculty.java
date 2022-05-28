package week8;

public class Faculty extends Employee {
    private int hours;
    private String rank;

    public Faculty() {
    }

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

    @Override
    public void bonus() {
        System.out.println("20% bonus will be given to faculty.");
    }

    @Override
    public void emailCheck() {
        System.out.println("check email faculty.");
    }

    @Override
    public double annualSalary() {
        return this.getSalary() * 12;
    }
}
