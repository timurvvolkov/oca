package lesson4_7;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesOldStyle {
    public static void main(String[] args) {
        Date d1 = new Date();
        LocalDate d2 = LocalDate.now();
//        System.out.println(d1);
//        System.out.println(d2);

        Calendar c = Calendar.getInstance();
        c.set(2020, Calendar.JANUARY, 1);
        Date jan1_1 = c.getTime();

        Calendar c2 = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        Date jan1_2 = c2.getTime();

        LocalDate jan2 = LocalDate.of(2020, Month.JANUARY, 1);

        Calendar c3 = Calendar.getInstance();
        c3.set(2020,0, 1);
        Date jan3 = c.getTime();

        LocalDate jan4 = LocalDate.of(2020, 1, 1);

        System.out.println(jan1_1);
        System.out.println(jan1_2);
        System.out.println(jan2);
        System.out.println(jan3);
        System.out.println(jan4);
    }
}
