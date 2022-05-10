package third_assignment;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        double average=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter #" + (i + 1) + " number: ");
            int number = input.nextInt();
            sum += number;
        }
        average=(double) sum/5;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);
    }
}
