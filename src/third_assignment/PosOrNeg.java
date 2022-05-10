package third_assignment;

import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Number is Positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}
