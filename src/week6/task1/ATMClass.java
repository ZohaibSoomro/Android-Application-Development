package week6.task1;

public class ATMClass {
    public static void main(String[] args) {
        ATM myAtm = new ATM();
        myAtm.setOwnerName("Zohaib");
        myAtm.setAmount(10000);

        System.out.println(myAtm.getOwnerName());
        System.out.println(myAtm.getAmount());
        System.out.println(myAtm.getPin());

        ATM mySecondAtm = new ATM("Hassan", 5000.0, 4568);

        System.out.println("-----------------");
        System.out.println(mySecondAtm.getOwnerName());
        System.out.println(mySecondAtm.getAmount()); 
        System.out.println(mySecondAtm.getPin());
    }
}
