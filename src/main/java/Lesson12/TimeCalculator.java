package Lesson12;

import org.w3c.dom.CDATASection;

import java.time.LocalDate;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeCalculator {

    public void daysToChristmasEveInfo() {

        LocalDate today = LocalDate.now();
        daysToChrist(today);
    }

    public void daysToChrist(LocalDate date) {

        LocalDate christmasEve = LocalDate.of(date.getYear(), 12, 24);
        long result = ChronoUnit.DAYS.between(date, christmasEve);
        if (result <= 60) {
            System.out.println("Time to buy gifts");
        }

        System.out.println("It's just " + result + " to Christmas Eve!");
    }

    public void minutesToEndOfClass() throws InterruptedException {
        long result;
        LocalTime FinishTime = LocalTime.of(16, 00, 00);
        do {
            LocalTime presenTime = LocalTime.now();
            result = ChronoUnit.MINUTES.between(presenTime, FinishTime);
            System.out.println("It's just " + result + " minutes to go to the car!");
            Thread.sleep(60000);
        }
        while (result >= 0);

    }
}
