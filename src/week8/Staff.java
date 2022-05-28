package week8;

public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class Name: Staff\nName: " + getName();
    }

    @Override
    public void bonus() {
        System.out.println("10% bonus will be given to Staff.");
    }

    @Override
    public void emailCheck() {
        System.out.println("Check the email staff.");

    }

    @Override
    public double annualSalary() {
        return getSalary() * 12;
    }
}
