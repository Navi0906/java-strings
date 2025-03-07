import java.util.Scanner;

public class CalendarDisplay {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }

    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1]; 
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return MONTH_NAMES[month - 1]; 
    }

    // Method to calculate the first day of the month
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7; 
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int daysInMonth = getDays(month, year);
        int firstDay = getFirstDay(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   "); 
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day); 
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); 
            }
        }
        System.out.println(); // Print a new line at the end
    }

    
}

/*
Input:
Enter month (1-12): 6
Enter year: 2003

Output:
     June 2003
Su Mo Tu We Th Fr Sa
  1  2  3  4  5  6  7
  8  9 10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30

*/