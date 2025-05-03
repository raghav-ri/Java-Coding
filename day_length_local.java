import java.time.LocalDate;
import java.util.Scanner;

class Length_of_day {
    LocalDate start;
    LocalDate end;

    Length_of_day(LocalDate s, LocalDate e) {
        start = s;
        end = e;
    }

    void calculate() {
        // Convert LocalDate to String and split into arrays
        String[] start_arr = start.toString().split("-");
        String[] end_arr = end.toString().split("-");

        int s_year = Integer.parseInt(start_arr[0]);
        int s_month = Integer.parseInt(start_arr[1]);
        int s_day = Integer.parseInt(start_arr[2]);
        int e_year = Integer.parseInt(end_arr[0]);
        int e_month = Integer.parseInt(end_arr[1]);
        int e_day = Integer.parseInt(end_arr[2]);

        int days = 0;

        // Calculate days from the start date to the end of the start year
        days += cal_len(s_year, s_month, s_day, true);

        // Add days for the years in between
        for (int i = s_year + 1; i < e_year; i++) {
            if (isleapyear(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        // Add days from the beginning of the end year to the end date
        days += cal_len(e_year, e_month, e_day, false);

        // Print the result
        System.out.println("Total days: " + days);
    }

    int cal_len(int year, int month, int day, boolean check) {
        int days[] = { 31, isleapyear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int dayz = 0;

        if (check) {
            // Add days from the given month to the end of the year
            for (int i = month - 1; i < 12; i++) {
                if (i == month - 1) {
                    dayz += days[i] - day + 1;
                } else {
                    dayz += days[i];
                }
            }
        } else {
            // Add days from the beginning of the year to the given month and day
            for (int i = 0; i < month - 1; i++) {
                dayz += days[i];
            }
            dayz += day;
        }

        return dayz; // Return the calculated days
    }

    boolean isleapyear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

public class day_length_local {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input LocalDate values
        int s_year=sc.nextInt();
        int s_month=sc.nextInt();
        int s_day=sc.nextInt();

        int e_year=sc.nextInt();
        int e_month=sc.nextInt();
        int e_day=sc.nextInt();

        LocalDate start=LocalDate.of(s_year,s_month,s_day);
        LocalDate end=LocalDate.of(e_year,e_month,e_day);
        Length_of_day ll=new Length_of_day(start,end);
        ll.calculate();
    }
}