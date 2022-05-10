package second_assignment;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        System.out.print("Enter number of minutes: ");
        int minutes = new Scanner(System.in).nextInt();
        int days = (minutes / 60) / 24;
        int years = days / 365;
        days = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
