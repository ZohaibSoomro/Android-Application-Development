package week4.task;

public class TestMobile {


    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        System.out.println("Mobile 1: " + mobile1.os);
        System.out.println("Mobile 1: " + mobile1.model);
        System.out.println("Mobile 1: " + mobile1.version);
        System.out.println("Mobile 1: " + mobile1.storage);
        System.out.println("Mobile 1: " + mobile1.screenSize);
        System.out.println("Mobile 1: " + mobile1.camera);
        System.out.println("Mobile 1: " + mobile1.volume);
        System.out.println("Mobile 1: " + mobile1.price);

        Mobile realMe = new Mobile();
        realMe.os = "Android 12";
        realMe.storage = 128;
        realMe.price = 23000;
        realMe.screenSize = 6.7;
        realMe.model = "Realme 8 pro";
        System.out.println("RealMe: " + realMe.os);
        System.out.println("RealMe: " + realMe.model);
        System.out.println("RealMe: " + realMe.version);
        System.out.println("RealMe: " + realMe.storage);
        System.out.println("RealMe: " + realMe.screenSize);
        System.out.println("RealMe: " + realMe.camera);
        System.out.println("RealMe: " + realMe.volume);
        System.out.println("RealMe: " + realMe.price);

        Mobile oppo = new Mobile(12.5, 30000);
        System.out.println("Oppo price: " + oppo.price);
        System.out.println("Oppo camera: " + oppo.camera);

    }
}
