package week7;

public class Animal extends Object {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I can eat.");
    }
}
