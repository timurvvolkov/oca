package lesson3_3;

public class IfThenElseSt {
    public static void main(String[] args) {
        boolean isMorning = false;
        boolean isEvening = false;

        if (isMorning) {
            System.out.println("Доброе утро");
        } else if (isEvening) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Доброго времени суток");
        }
    }
}
