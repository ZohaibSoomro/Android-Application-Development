package second_assignment;

import java.util.Scanner;

public class FeetIntoMeters {
    public static void main(String[] args) {
        System.out.print("Enter a value for feet: ");
        double feet = new Scanner(System.in).nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters.");

    }
}
