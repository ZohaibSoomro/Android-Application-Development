package week7;

public class Dog extends Animal {
    public void display() {
        setName("Jack");
        System.out.println("I am " + getName());
    }

    public void bark() {
        System.out.println("I can bark");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog can eat.");
    }
}


class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        dog.eat();
        dog.bark();
    }
}
