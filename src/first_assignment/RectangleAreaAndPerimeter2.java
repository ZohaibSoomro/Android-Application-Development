package first_assignment;

import java.util.Scanner;

public class RectangleAreaAndPerimeter2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.print("Enter width: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Enter height: ");
        double height = new Scanner(System.in).nextDouble();

        double perimeter = 2 * (width + height);
        double area = width * height;
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
