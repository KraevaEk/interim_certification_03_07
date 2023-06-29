package task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;

public class DateWater {

    private static LocalDate dateWater;

    public DateWater() {
    }

    public LocalDate getDateWater(LocalDate dateLastWater) {

        LocalDate dateWater = LocalDate.now();
        EnumSet<Month> winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
        EnumSet<Month> springAutumn = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.MARCH, Month.APRIL, Month.MAY);
        EnumSet<Month> summer = EnumSet.of(Month.JUNE, Month.JULY, Month.AUGUST);

        if (winter.contains(LocalDate.now().getMonth())) {
            dateWater = dateLastWater.plusMonths(1);
        }

        if (springAutumn.contains(LocalDate.now().getMonth())) {
            dateWater = dateLastWater.plusWeeks(1);
        }

        if (summer.contains(LocalDate.now().getMonth())) {
            int humidity = new Humidity().getHumidity();
            System.out.println("Влажность " + humidity + "%");
            if (humidity < 30 ) {
                dateWater = LocalDate.now();
            } else {
                dateWater = dateLastWater.plusDays(2);
            }
        }
        return dateWater;
    }

}
