package week7;

class Cat extends Animal {
    public void display() {
        setName("catty");
        System.out.println("I am " + getName());
    }

    public void meow() {
        System.out.println("I can meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat can eat.");
    }
}


class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
        cat.eat();
        cat.meow();
    }
}