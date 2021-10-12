package lesson4_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatesAndTimeInAction {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.DECEMBER, 20);
        LocalDate date2 = LocalDate.of(2020, 12, 20);
//        System.out.println(date1);
//        System.out.println(date2);

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
//        System.out.println(time1);
//        System.out.println(time2);
//        System.out.println(time3);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.DECEMBER, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
