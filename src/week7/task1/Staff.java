package week7.task1;

public class Staff extends Employee {
    private String title;
    public Staff(){}

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
}
