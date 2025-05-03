import java.util.Scanner;

class Dayz {
    static int days_cal(String start, String last) {
        String[] start_arr = start.split("-");
        String[] end_arr = last.split("-");

        int s_year = Integer.parseInt(start_arr[0]);
        int s_month = Integer.parseInt(start_arr[1]);
        int s_day = Integer.parseInt(start_arr[2]);

        int e_year = Integer.parseInt(end_arr[0]);
        int e_month = Integer.parseInt(end_arr[1]);
        int e_day = Integer.parseInt(end_arr[2]);

        int totalDays = 0;

        // Calculate days from the start date to the end of the start year
        totalDays += daysInYear(s_month, s_day, true);

        // Add days for the years in between
        for (int year = s_year + 1; year < e_year; year++) {
            totalDays += isLeapYear(year) ? 366 : 365;
        }

        // Add days from the beginning of the end year to the end date
        totalDays += daysInYear(e_month, e_day, false);

        // If the start and end year are the same, adjust the calculation
        if (s_year == e_year) {
            totalDays = daysInYear(e_month, e_day, false) - daysInYear(s_month, s_day, true);
        }

        return totalDays;
    }

    static int daysInYear(int month, int day, boolean isStart) {
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int days = 0;

        if (isStart) {
            // Add days from the given month to the end of the year
            for (int i = month - 1; i < 12; i++) {
                days += daysInMonths[i];
            }
            days -= day - 1; // Subtract the days before the given day
        } else {
            // Add days from the beginning of the year to the given month and day
            for (int i = 0; i < month - 1; i++) {
                days += daysInMonths[i];
            }
            days += day;
        }

        // Adjust for leap years
        if (month > 2 && isLeapYear(isStart ? 0 : 1)) {
            days++;
        }

        return days;
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start date (YYYY-MM-DD):");
        String start_date = sc.nextLine();
        System.out.println("Enter the end date (YYYY-MM-DD):");
        String end_date = sc.nextLine();

        int days = Dayz.days_cal(start_date, end_date);
        System.out.println("Total days between the dates: " + days);
    }
}
