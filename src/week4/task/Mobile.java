package week4.task;

public class Mobile {
    int volume, storage;
    double screenSize, camera, price, version = 10.1;
    String os, model = "Latest Model";

    public Mobile() {
        volume = 10;
        storage = 64;
        screenSize = 6.5;
        camera = 12.5;
        price = 10000.0;
        version = 2.0;
        os = "Android 11";
        model = "Redmi Note 6 pro";
    }

    public Mobile(double camera, double price) {
        this.camera = camera;
        this.price = price;
    }
}
