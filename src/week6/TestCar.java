package week6;

public class TestCar {
    public static void main(String[] args) {
        Car mehran = new Car(5, "Black", "Mehran-2019");

        Car corolla = new Car("Blue");
        Car civic = new Car(5, "Purple");
        printObject(mehran);

        System.out.println("Mehran color: " + mehran.color);
        System.out.println("Mehran no of seats: " + mehran.noOfSeats);
        System.out.println("Civic color: " + civic.color);
        System.out.println("Corolla color: " + corolla.color);
    }

    public static void printObject(Car car) {
        System.out.println("Model of Car: " + car.model);
        System.out.println("Color: " + car.color);
        System.out.println("No of Seats: " + car.noOfSeats);
    }
}
