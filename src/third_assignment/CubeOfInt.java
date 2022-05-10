package third_assignment;

import java.util.Scanner;

public class CubeOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int noOfTerms = input.nextInt();
        for (int i = 1; i <= noOfTerms; i++) {
            System.out.println("Number is : " + i + " and cube of 1 is : " + (i * i * i));
        }
    }

}
