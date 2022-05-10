package second_assignment;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter a degree in celsius: ");
        double celsius = new Scanner(System.in).nextDouble();
        double fahrenheit = (9 * celsius) / 5 + 32;
        System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");

    }
}
