package lesson3_3;

public class ForLoop {
    public static void main(String[] args) {
        for (int y = 2, x = 4; y < 10 && x < 5; x++, y++) {
            System.out.println("y = " + y);
            System.out.println("x = " + x);
        }
    }
}
