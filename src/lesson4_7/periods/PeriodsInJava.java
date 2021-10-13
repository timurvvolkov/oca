package lesson4_7.periods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodsInJava {
    public static void main(String[] args) {
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        //trap
        Period wrong = Period.ofYears(1).ofWeeks(1);

        //same
        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);

        //trap2
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
//        System.out.println(time.plus(period));
    }
}
