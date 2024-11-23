package com.github.kadehar.inno.exam1.task2.sensor;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;

public class WateringDate {

    private final EnumSet<Month> winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
    private final EnumSet<Month> spring = EnumSet.of(Month.MARCH, Month.APRIL, Month.MAY);
    private final EnumSet<Month> summer = EnumSet.of(Month.JUNE, Month.JULY, Month.AUGUST);
    private final EnumSet<Month> fall = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER);

    public LocalDate next(LocalDate previous) {
        Month month = previous.getMonth();
        if (winter.contains(month)) {
            return previous.plusMonths(1);
        } else if (spring.contains(month) || fall.contains(month)) {
            return previous.plusWeeks(1);
        } else if (summer.contains(month)) {
            if (HumiditySensor.humidity() < 30) {
                return previous.plusDays(2);
            }
        }

        return null;
    }
}
