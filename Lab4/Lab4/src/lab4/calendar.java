package lab4;

import java.util.Scanner;

public class calendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the year and the first day of the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = scanner.nextInt();

        // Display the calendars for May and August
        displayCalendar(year, 5, "May", firstDay);
        displayCalendar(year, 8, "August", getFirstDayOfMonth(year, 8, firstDay));
    }

    // Function to display the calendar for a specific month
    public static void displayCalendar(int year, int month, String monthName, int firstDay) {
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month
        int currentDay = firstDay;

        // Determine the number of days in the month
        int daysInMonth = getDaysInMonth(year, month);

        // Print leading spaces for the first week
        for (int i = 0; i < currentDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day
            System.out.printf("%3d ", day);

            // Move to the next day of the week
            currentDay = (currentDay + 1) % 7;

            // Start a new line for the next week
            if (currentDay == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Add a newline after the calendar
    }

    // Function to get the number of days in a month
    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonth[month];
        }
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to get the first day of a specific month
    public static int getFirstDayOfMonth(int year, int month, int firstDayOfYear) {
        int days = 0;

        for (int i = 1; i < month; i++) {
            days += getDaysInMonth(year, i);
        }

        return (firstDayOfYear + days) % 7;
    }
}