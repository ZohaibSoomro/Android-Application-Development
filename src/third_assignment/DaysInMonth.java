package third_assignment;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        int daysInMonth = 0;
        String month = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int monthNumber = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (monthNumber) {
            case 2:
                daysInMonth = 28;
                month = "February";
                if (year % 4 == 0)
                    daysInMonth = 29;
                break;
            case 1:
                daysInMonth = 31;
                month = "January";
                break;
            case 3:
                daysInMonth = 31;
                month = "March";
                break;
            case 5:
                daysInMonth = 31;
                month = "May";
                break;
            case 7:
                daysInMonth = 31;
                month = "July";
                break;
            case 8:
                daysInMonth = 31;
                month = "August";
                break;
            case 10:
                daysInMonth = 31;
                month = "October";
                break;
            case 12:
                daysInMonth = 31;
                month = "December";
                break;
            case 4:
                daysInMonth = 30;
                month = "April";
                break;
            case 6:

                daysInMonth = 30;
                month = "June";
                break;
            case 9:
                daysInMonth = 30;
                month = "September";
                break;
            case 11:
                daysInMonth = 30;
                month = "November";
                break;

        }
        System.out.println(month + " " + year + " has " + daysInMonth + " days");
    }
}
