package week6;

public class Car {
    int noOfSeats;
    String color;
    String model;

    public Car() {
    }

    public Car(String color) {
        this.noOfSeats = 5;
        this.color = color;
    }

    public Car(int noOfSeats, String color) {
        this.noOfSeats = noOfSeats;
        this.color = color;
    }

    public Car(int noOfSeats, String color, String model) {
        this.noOfSeats = noOfSeats;
        this.color = color;
        this.model = model;
    }

    public void drive(String model) {
        System.out.println(model + " is driving.");
    }

    public void brake(String model) {
        System.out.println(model + " is stopped.");
    }


}
