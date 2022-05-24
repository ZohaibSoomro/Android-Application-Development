package week7;

public class Mango extends Fruit {
    private double price;

    public Mango(String name) {
        setName(name);
        setColor("Yellow");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        super.display();
        System.out.println("Price is " + price);
    }
}
