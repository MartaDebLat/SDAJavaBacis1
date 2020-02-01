package Lesson12;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TimeCalculator timeCalculator = new TimeCalculator();
//        TimeCalculator.daysToChrist(LocalDate.of(2020, 7, 22));
//        TimeCalculator.daysToChrist(LocalDate.of(2023, 12, 22));
//        TimeCalculator.daysToChristmasEveInfo();

        timeCalculator.minutesToEndOfClass();

    }
}
