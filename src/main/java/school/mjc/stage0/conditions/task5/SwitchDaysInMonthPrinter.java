package school.mjc.stage0.conditions.task5;

import java.time.Month;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            default:
                System.out.println(month >= 1 && month <= 12 ? Month.of(month).length(false) : "wrong number!");
        }
    }
}
