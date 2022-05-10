package second_assignment;

import java.util.Scanner;

public class PoundsIntoKilograms {
    public static void main(String[] args) {
        System.out.print("Enter a value in pounds: ");
        double pounds = new Scanner(System.in).nextDouble();
        double kgs = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kgs + " kgs.");

    }
}
