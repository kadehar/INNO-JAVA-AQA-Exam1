package com.github.kadehar.inno.exam1.task2;

import java.time.LocalDate;

public class WateringProgram {
    private final WateringDate wateringDate;

    public WateringProgram(WateringDate wateringDate) {
        this.wateringDate = wateringDate;
    }

    public LocalDate wateringOn(LocalDate previous) {
        return wateringDate.next(previous);
    }
}
