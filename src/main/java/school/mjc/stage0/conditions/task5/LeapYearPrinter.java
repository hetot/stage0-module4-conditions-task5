package school.mjc.stage0.conditions.task5;

import java.time.Year;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year) {
            default:
                System.out.println(Year.of(year).isLeap() ? "leap" : "not leap");
        }
    }
}
