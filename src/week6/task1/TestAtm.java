package week6.task1;

import java.util.Scanner;

public class TestAtm {
    public static void main(String[] args) {
        ATM myAtm = new ATM();
        myAtm.setOwnerName("Zohaib");
        myAtm.setAmount(10000);

        ATM atm2 = new ATM("Hassan", 5000.0, 4568, "009867007900023");
        ATM atm3 = new ATM("Ahmed", 25000.0, 8700, "009867897900023");
        ATM atm4 = new ATM("Ali", 2000.0, 1234, "007267907900023");
        ATM atm5 = new ATM("Subhan", 10200.0, 4138, "0071967007900023");

        switch (getValue()) {
            case 1:
                printAtm(myAtm);
                break;
            case 2:
                printAtm(atm2);
                break;
            case 3:
                printAtm(atm3);
                break;
            case 4:
                printAtm(atm4);
                break;
            case 5:
                printAtm(atm5);
                break;
        }
    }

    public static int getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value(1-5): ");
        return input.nextInt();
    }


    public static void printAtm(ATM myAtm) {
        System.out.println(myAtm.getOwnerName());
        System.out.println(myAtm.getAmount());
        System.out.println("-------------");
    }
}
