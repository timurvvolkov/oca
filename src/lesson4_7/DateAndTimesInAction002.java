package lesson4_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateAndTimesInAction002 {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        System.out.println(date);
//        date = date.plusDays(2);
//        System.out.println(date);
//        date = date.plusWeeks(1);
//        System.out.println(date);
//        date = date.plusMonths(1);
//        System.out.println(date);
//        date = date.plusYears(5);
//        System.out.println(date);

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5, 15);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        System.out.println(dateTime);
//        dateTime = dateTime.minusDays(1);
//        System.out.println(dateTime);
//        dateTime = dateTime.minusHours(10);
//        System.out.println(dateTime);
//        dateTime = dateTime.minusSeconds(30);
//        System.out.println(dateTime);

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5, 15);
//        LocalDateTime dateTime = LocalDateTime.of(date, time)
//                .minusDays(1)
//                .minusHours(10)
//                .minusSeconds(30);
//        System.out.println(dateTime);

        //trap
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        date.plusDays(10);
//        System.out.println(date);
    }

    //old style + day
    public Date addDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    //new
    public LocalDate addDay(LocalDate date) {
        return date.plusDays(1);
    }

    //old style - day
    public Date substractDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    //new
    public LocalDate substractDay(LocalDate date) {
        return date.minusDays(1);
    }
}
