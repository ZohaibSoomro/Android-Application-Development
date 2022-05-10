package first_assignment;

import java.util.Scanner;

public class CircleAreaAndPerimeter2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.print("Enter a radius: ");
        double radius = new Scanner(System.in).nextDouble();

        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
