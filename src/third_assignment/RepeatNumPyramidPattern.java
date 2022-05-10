package third_assignment;

import java.util.Scanner;

public class RepeatNumPyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
