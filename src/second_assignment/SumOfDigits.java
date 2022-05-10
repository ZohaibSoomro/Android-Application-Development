package second_assignment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        while (true) {
            int remainder = number % 10;
            sum += remainder;
            if (remainder == number)
                break;
            number /= 10;
        }
        System.out.println("Sum is "+sum);
    }
}
