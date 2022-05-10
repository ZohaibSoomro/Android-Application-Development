package third_assignment;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int number3 = input.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Greatest number is : " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greatest number is : " + number2);

        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Greatest number is : " + number3);

        } else {
            System.out.println("Two or more numbers are equal.");
        }
    }
}
