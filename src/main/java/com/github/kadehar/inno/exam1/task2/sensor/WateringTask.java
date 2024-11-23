package com.github.kadehar.inno.exam1.task2.sensor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WateringTask {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        WateringProgram wateringProgram = new WateringProgram(new WateringDate());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату последнего полива в формате дд.мм.гг: ");
        String date = scanner.nextLine();
        LocalDate previousDate = LocalDate.parse(date, dateTimeFormatter);
        LocalDate next = wateringProgram.wateringOn(previousDate);
        System.out.println("Дата следующего полива: " + next.format(dateTimeFormatter));
    }
}
