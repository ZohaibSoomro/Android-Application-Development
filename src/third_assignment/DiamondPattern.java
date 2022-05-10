package third_assignment;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows(half of the diamond): ");
        int rows = 7;// input.nextInt();
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
