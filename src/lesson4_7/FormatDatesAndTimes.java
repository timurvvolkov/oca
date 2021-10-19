package lesson4_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDatesAndTimes {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfYear());
//
//        System.out.println(date.getChronology());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getEra());
//        System.out.println(date.getMonthValue());

        //DateTimeFormatter
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        System.out.println(date.
//                format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(time.
//                format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dateTime.
//                format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(dateTime.format(shortDateTime));
//        System.out.println(date.format(shortDateTime));
//        System.out.println(time.format(shortDateTime));

//        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(shortDateTime.format(dateTime));
//        System.out.println(shortDateTime.format(date));
//        System.out.println(shortDateTime.format(time));

        //SHORT and MEDIUM
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
//
//        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        System.out.println(dateTime.format(shortF));
//        System.out.println(dateTime.format(mediumF));

        // MMMM - месяц
        // dd - день
        // yyyy - год
        // hh - час
        // : - если хотим вывести разделитель-двоеточие
        // mm - минуты
//        DateTimeFormatter f = DateTimeFormatter
//                .ofPattern("MM dd, yy, hhmm");
//        System.out.println(dateTime.format(f));

        //?
        DateTimeFormatter f1 = DateTimeFormatter
                .ofPattern("hh:mm");
        System.out.println(f1.format(dateTime));
//        f1.format(date);
        System.out.println(f1.format(time));
    }
}
