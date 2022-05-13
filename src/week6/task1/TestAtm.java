package week6.task1;

import week6.User;

import java.util.Scanner;

public class TestAtm {
    public static void main(String[] args) {

//        ATM atm1 = new ATM("Zohaib", 10000, 98990, 1235);
//        ATM atm2 = new ATM("Hassan", 5000.0, 98670, 4568);
//        ATM atm3 = new ATM("Ahmed", 25000.0, 98678, 8700);
//        ATM atm4 = new ATM("Ali", 2000.0, 72679, 1234);
//        ATM atm5 = new ATM("Subhan", 10200.0, 96700, 4138);
//
//        switch (getValue()) {
//            case 1:
//                printAtmData(atm1);
//                break;
//            case 2:
//                printAtmData(atm2);
//                break;
//            case 3:
//                printAtmData(atm3);
//                break;
//            case 4:
//                printAtmData(atm4);
//                break;
//            case 5:
//                printAtmData(atm5);
//                break;
//            default:
//                System.out.println("Invalid input!");
//        }
        User user = new User("Zohaib", "45104868689016", 20);
        ATM atm = new ATM("Zohaib", 10000, 98990, 1235, user);

    }

    public static int getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value(1-5): ");
        return input.nextInt();
    }


    public static void printAtmData(ATM atm) {
        System.out.println(atm.getOwnerName());
        System.out.println(atm.getAmount());
        System.out.println("-------------");
    }
}
