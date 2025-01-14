package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeeks = date.getDayOfWeek();
        System.out.println("firstDayOfWeeks = " + firstDayOfWeeks);
        DayOfWeek lastDayOfWeeks = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("lastDayOfWeeks = " + lastDayOfWeeks);
    }
}
