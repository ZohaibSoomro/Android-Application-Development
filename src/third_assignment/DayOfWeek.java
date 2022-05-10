package third_assignment;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number(1-7): ");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("It's Monday today.");
                break;
            case 2:
                System.out.println("It's Tuesday today.");
                break;
            case 3:
                System.out.println("It's Wednesday today.");
                break;
            case 4:
                System.out.println("It's Thursday today.");
                break;
            case 5:
                System.out.println("It's Friday today.");
                break;
            case 6:
                System.out.println("It's Saturday today.");
                break;
            case 7:
                System.out.println("It's Sunday today.");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}
