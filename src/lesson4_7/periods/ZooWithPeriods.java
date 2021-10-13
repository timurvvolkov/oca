package lesson4_7.periods;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ZooWithPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2020, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("дать новую игрушку: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
