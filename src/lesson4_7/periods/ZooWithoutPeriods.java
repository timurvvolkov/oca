package lesson4_7.periods;

import java.time.LocalDate;
import java.time.Month;

public class ZooWithoutPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2020, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("дать новую игрушку:" + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
