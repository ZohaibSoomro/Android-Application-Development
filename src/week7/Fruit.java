package week7;

public class Fruit {
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void display(){
        System.out.println("Fruit is "+name);
        System.out.println("Color is "+color);
    }
}
