package lesson4_7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {
    public static void main(String[] args) {
        String s = "01 02 2015";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse(s, f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }
}
